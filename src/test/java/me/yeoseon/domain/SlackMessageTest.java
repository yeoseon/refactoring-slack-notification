package me.yeoseon.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jackson.JsonLoader;
import me.yeoseon.dj.domain.SlackMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class SlackMessageTest {

    @Test
    @DisplayName("convertSlackMessageToJson를 테스트하기 전 ObjectMapper의 writeValueAsString() 메소드가 잘 동작하는 지 확인한다.")
    void writeValueAsString() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        SlackMessage message = new SlackMessage();

        String result = objectMapper.writeValueAsString(message);

        assertThat(result).isEqualTo(getSampleMessage());
    }

    @Test
    @DisplayName("SlackMessage 내의 정보를 통해 JSON으로 변환한 String을 반환한다.")
    void convertSlackMessageToJson() throws  {
        SlackMessage message = new SlackMessage();

        String result = message.convertSlackMessageToJson();

        assertThat(result).isEqualTo(getSampleMessage());
    }

    private String getSampleMessage() {
        File file = new File(getClass().getClassLoader().getResource("SlackMessageSample.json").getFile());
        try {
            JsonNode sampleMessage = JsonLoader.fromFile(file);
            return sampleMessage.toString();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        return null;
    }
}
