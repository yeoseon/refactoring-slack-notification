package me.yeoseon.domain;

import me.yeoseon.dj.domain.SlackNotifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SlackNotifierTest {

    @Test
    @DisplayName("REST API를 이용하여 slack에 메시지를 Notify 한다.")
    void notifyMessage() {
        String message = "안녕";

        SlackNotifier slackNotifier = new SlackNotifier();
        slackNotifier.notifyMessage(message);
    }
}
