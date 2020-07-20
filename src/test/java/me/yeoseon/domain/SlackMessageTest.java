package me.yeoseon.domain;

import me.yeoseon.dj.domain.SlackMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SlackMessageTest {

    @Test
    @DisplayName("출력하고 싶은 메시지를 받아 Request 형태로 변경한다")
    void convertMessage() {
        String message = "안뇽";
        SlackMessage slackMessage = new SlackMessage(message);

        String expectedRequest = "{\n\"text\": \"안녕\"\n}";
        assertThat(slackMessage.getMessage()).isEqual(expectedRequest);
    }
}
