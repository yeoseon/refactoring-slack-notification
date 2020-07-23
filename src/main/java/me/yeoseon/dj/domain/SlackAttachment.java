package me.yeoseon.dj.domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.yeoseon.dj.Constants;

public class SlackAttachment {
    @JsonProperty
    private String title; // title
    @JsonProperty
    private String text; // 사연
    @JsonProperty
    private String footer; // ~의 신청곡입니다. userNm
    @JsonProperty
    private String color; // Bar color

    // Test용 생성자
    public SlackAttachment() {
        this.title = Constants.ATTACHMENT_TEST_TITLE1;
        this.text = Constants.ATTACHMENT_TEST_TEXT;
        this.footer = Constants.ATTACHMENT_TEST_FOOTER;
        this.color = Constants.ATTACHMENT_BAR_COLOR_MAIN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
