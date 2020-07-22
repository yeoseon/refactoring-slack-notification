package me.yeoseon.dj;

import me.yeoseon.dj.domain.SlackAttachment;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String TARGET_URL = "https://hooks.slack.com/services/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";

    public static final String CHANNEL = "webhook";

    public static final String USER_NAME = "DJ Celine";
    public static final String ICON_EMOJI = ":musical_note:";

    public static final String TEST_TEXT_MAIN = "*DJ Celine이 전해드리는 오늘의 음악 :musical_note:*";
    public static final List<SlackAttachment> TEST_ATTACHMENTS = getTestAttachments();

    // TODO: Attachment 용 Constant 로 분리?
    public static final String ATTACHMENT_TEST_TITLE1 = "이승철 - 오늘도 난";
    public static final String ATTACHMENT_TEST_TITLE2 = "김동률 - 같이 걸을까";
    public static final String ATTACHMENT_TEST_TEXT = ":pencil: 우리아빠가 좋아하는 노래에요";
    public static final String ATTACHMENT_TEST_NO_REQUEST_TEXT = ":star: TOP 10 :star:";
    public static final String ATTACHMENT_TEST_FOOTER = "윤여선 님의 신청곡입니다.";
    public static final String ATTACHMENT_TEST_NO_REQUEST_FOOTER = "TOP 10에 선정된 곡입니다.";
    public static final String ATTACHMENT_BAR_COLOR_MAIN = "#BCBABE";
    public static final String ATTACHMENT_BAR_COLOR_SUB = "#A1D6E2";


    private static List<SlackAttachment> getTestAttachments() {
        List<SlackAttachment> testAttachments = new ArrayList<>();
        SlackAttachment slackAttachment = new SlackAttachment();

        slackAttachment.setTitle(ATTACHMENT_TEST_TITLE2);
        slackAttachment.setText(ATTACHMENT_TEST_NO_REQUEST_TEXT);
        slackAttachment.setFooter(ATTACHMENT_TEST_NO_REQUEST_FOOTER);
        slackAttachment.setColor(ATTACHMENT_BAR_COLOR_SUB);

        testAttachments.add(new SlackAttachment());
        testAttachments.add(slackAttachment);

        return testAttachments;
    }
}
