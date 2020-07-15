package me.yeoseon.dj.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import me.yeoseon.dj.dto.PlayDto;
import me.yeoseon.dj.dto.SlackAttachmentDto;
import me.yeoseon.dj.dto.SlackMsgRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class DJSlackService {

    @Autowired
    private EntertainmentProperties entertainmentProperties;

    @Autowired
    private CommonProperties commonProperties;

    private static final Logger logger           = LoggerFactory.getLogger(DJSlackService.class);

    public void sendMessage(List<PlayDto> playList) throws JsonParseException, JsonMappingException, IOException {

        SlackMsgRequestDto rqst = _assembleRqst(playList);

        _sendPost(commonProperties.getSlackWebhookUrl(), rqst);
    }

    private SlackMsgRequestDto _assembleRqst(List<PlayDto> playList) throws JsonParseException, JsonMappingException, IOException {

        SlackMsgRequestDto rqst = new SlackMsgRequestDto();

        rqst.setChannel(entertainmentProperties.getSlack().getChannel());
        rqst.setUsername(entertainmentProperties.getSlack().getUsername());
        rqst.setIconEmoji(entertainmentProperties.getSlack().getIconEmoji());
        rqst.setText("*DJ 핀뢥이 전해드리는 오늘의 음악 :musical_note:* \n <"+ entertainmentProperties.getSlack().getUrl() +"|_좋아요 누르러 가기_>");
        List<SlackAttachmentDto> attachmentList = new ArrayList<SlackAttachmentDto>();

        int count = 1;
        for(PlayDto playItem : playList) {

            SlackAttachmentDto attachment = new SlackAttachmentDto();

            attachment.setTitle(playItem.getSong().getTitle());

            List<Request> requestList = playItem.getRequest();

            if(requestList == null) {
                attachment.setText(":star: TOP 10 :star:");
                attachment.setFooter("TOP 10에 선정된 곡입니다.");
            }
            else {
                StringBuilder sb = new StringBuilder();
                for(Request requestItem : requestList) {
                    int buildCount = 1;

                    sb.append(":pencil: " + requestItem.getStory());

                    if(buildCount < requestList.size()) {
                        sb.append("\n");
                    }
                    buildCount ++;
                }

                attachment.setText(sb.toString());
                attachment.setFooter(requestList.get(0).getUserNm() + "님의 신청곡입니다.");
            }

            if(count % 2 == 0) {
                attachment.setColor(entertainmentProperties.getSlack().getBarColorMain());
            }
            else {
                attachment.setColor(entertainmentProperties.getSlack().getBarColorSub());
            }
            attachmentList.add(attachment);

            count++;
        }
        rqst.setAttachments(attachmentList);

        return rqst;
    }


    private void _sendPost(String targetUrl, SlackMsgRequestDto rqst) throws RestClientException, JsonProcessingException {

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        restTemplate.postForEntity(targetUrl, objectToJson(rqst), String.class);
    }

    public String objectToJson(Object object) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.writeValueAsString(object);
    }

}
