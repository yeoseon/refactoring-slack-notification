package me.yeoseon.dj;

import me.yeoseon.dj.domain.SlackAttachment;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String TARGET_URL = "https://hooks.slack.com/services/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";

    public static final String CHANNEL = "webhook";

    public static final String BAR_COLOR_MAIN = "#BCBABE";
    public static final String BAR_COLOR_SUB = "#A1D6E2";

    public static final String USER_NAME = "DJ Celine";
    public static final String ICON_EMOJI = ":musical_note:";

    public static final String TEST_TEXT_MAIN = "*DJ Celine이 전해드리는 오늘의 음악 :musical_note:*";
    public static final List<SlackAttachment> TEST_ATTATCHMENTS = getTestAttachments();

    private static List<SlackAttachment> getTestAttachments() {
        List<SlackAttachment> testAttachments = new ArrayList<>();

        return testAttachments;
    }

    // TODO: Attatchment용 Constant로 분리?
    public static final String ATTACHMENT_TEST_TITLE = "오늘도 난";
    public static final String ATTACHMENT_TEST_REQUEST = "윤여선";
    public static final String ATTACHMENT_TEST_NO_REQUEST_TEXT = ":star: TOP 10 :star:";
    public static final String ATTACHMENT_TEST_FOOTER = "TOP 10에 선정된 곡입니다.";
}
