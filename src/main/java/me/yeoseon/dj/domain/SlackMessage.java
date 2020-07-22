package me.yeoseon.dj.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.yeoseon.dj.Constants;
import me.yeoseon.dj.dto.SlackAttachmentDto;

/**
 * Slack에 메시지 전송 요청을 위한 Json Message 객체
 */
public class SlackMessage {

	private String channel;
	private String text; //
	private List<SlackAttachmentDto> attachments;
	private String userName;
	private String iconEmoji;

	public SlackMessage() {
		this.channel = Constants.CHANNEL;
		this.userName = Constants.USER_NAME;
		this.text = Constants.TEST_TEXT;
		this.attachments = Constants.TEST_ATTATCHMENTS;
		this.iconEmoji = Constants.ICON_EMOJI;
	}

	public SlackMessage(String channel, String userName, String text, List<SlackAttachmentDto> attachments, String iconEmoji) {
		this.channel = channel;
		this.userName = userName;
		this.text = text;
		this.attachments = attachments;
		this.iconEmoji = iconEmoji;
	}

	public String convertSlackMessageToJson() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();

		return objectMapper.writeValueAsString(this);
	}
}
