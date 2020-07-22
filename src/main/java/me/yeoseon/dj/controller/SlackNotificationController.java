package me.yeoseon.dj.controller;

import me.yeoseon.dj.Constants;
import me.yeoseon.dj.domain.SlackEnvironment;
import me.yeoseon.dj.domain.SlackNotifier;

public class SlackNotificationController {

    public static void play() {
        SlackEnvironment slackEnvironment = new SlackEnvironment(Constants.TARGET_URL);
        SlackNotifier slackNotifier = new SlackNotifier(slackEnvironment);

        slackNotifier.notifyMessage("안뇽안뇽");
    }
}
