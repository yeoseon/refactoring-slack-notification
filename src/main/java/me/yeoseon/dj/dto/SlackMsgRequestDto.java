package me.yeoseon.dj.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.yeoseon.dj.Constants;

/**
 * Slack에 메시지 전송 요청을 위한 Json Message 객체
 */
public class SlackMsgRequestDto {

	private String channel;
	private String text; // 오전/오후 음악 리스트 입니다
	private List<SlackAttachmentDto> attachments;
	private String username;
	private String iconEmoji;

	public SlackMsgRequestDto(String channel, String userName, String text, List<SlackAttachmentDto> attachments, String iconEmoji) {
		this.channel = channel;
		this.username = userName;
		this.text = text;
		this.attachments = attachments;
		this.iconEmoji = iconEmoji;
	}
}
