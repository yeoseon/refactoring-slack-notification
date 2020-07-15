package me.yeoseon.dj.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Slack 메시지 전송 요청을 위한 객체(SlackMstRequestDto)를 구성하는 Attachment 객체
 */
@Getter
@Setter
@NoArgsConstructor
public class SlackAttachmentDto {

	private String title; // title
	private String text; // 사연
	private String footer; // ~의 신청곡입니다. userNm
	private String color; // Bar color

}
