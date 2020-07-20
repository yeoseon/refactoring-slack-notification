package me.yeoseon.dj.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Slack 메시지 전송 요청을 위한 객체(SlackMstRequestDto)를 구성하는 Attachment 객체
 */
@NoArgsConstructor
public class SlackAttachmentDto {
	private String title; // title
	private String text; // 사연
	private String footer; // ~의 신청곡입니다. userNm
	private String color; // Bar color

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
