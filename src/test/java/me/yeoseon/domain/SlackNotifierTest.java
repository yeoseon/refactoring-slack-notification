package me.yeoseon.domain;

import me.yeoseon.dj.domain.SlackEnvironment;
import me.yeoseon.dj.domain.SlackNotifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SlackNotifierTest {
    private static final String TARGET_URL = "https://hooks.slack.com/services/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";

    @Test
    @DisplayName("REST API를 이용하여 slack에 메시지를 Notify 한다.")
    void notifyMessage() {
        String message = "안녕";

        SlackNotifier slackNotifier = new SlackNotifier(new SlackEnvironment(TARGET_URL));
        slackNotifier.notifyMessage(message);
    }
}
