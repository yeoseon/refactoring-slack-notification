package me.yeoseon.dj;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String TARGET_URL = "https://hooks.slack.com/services/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";

    public static final String CHANNEL = "webhook";

    public static final String BAR_COLOR_MAIN = "#BCBABE";
    public static final String BAR_COLOR_SUB = "#A1D6E2";

    public static final String USER_NAME = "DJ Celine";
    public static final String ICON_EMOJI = ":musical_note:";

    public static final String TEST_TEXT = "오전/오후 음악 리스트 입니다";
    public static final List<SlackAttachmentDto> TEST_ATTATCHMENTS = getTestAttachments();

    private static List<SlackAttachmentDto> getTestAttachments() {
        List<SlackAttachmentDto> testAttachments = new ArrayList<>();

        return testAttachments;
    }
}
