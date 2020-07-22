package me.yeoseon.domain;

import me.yeoseon.dj.domain.SlackMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SlackMessageTest {

    @Test
    @DisplayName("SlackMessage 내의 정보를 통해 JSON으로 변환한 String을 반환한다.")
    void convertSlackMessageToJson() {
        SlackMessage message = new SlackMessage();
    }
}
