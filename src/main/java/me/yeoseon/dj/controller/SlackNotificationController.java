package me.yeoseon.dj.controller;

import me.yeoseon.dj.domain.SlackEnvironment;
import me.yeoseon.dj.domain.SlackNotifier;

public class SlackNotificationController {

    private static final String TARGET_URL = "https://hooks.slack.com/services/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";

    public static void play() {
        SlackEnvironment slackEnvironment = new SlackEnvironment(TARGET_URL);
        SlackNotifier slackNotifier = new SlackNotifier(slackEnvironment);

        slackNotifier.notifyMessage("안뇽안뇽");
    }
}
