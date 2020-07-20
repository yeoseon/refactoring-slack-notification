package me.yeoseon.dj.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Slack에 메시지 전송 요청을 위한 Json Message 객체
 */
public class SlackMsgRequestDto {

	private String channel;
	private String text; // 오전/오후 음악 리스트 입니다
	private List<SlackAttachmentDto> attachments;
	private String username;
	@JsonProperty("icon_emoji") private String iconEmoji;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<SlackAttachmentDto> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<SlackAttachmentDto> attachments) {
		this.attachments = attachments;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIconEmoji() {
		return iconEmoji;
	}

	public void setIconEmoji(String iconEmoji) {
		this.iconEmoji = iconEmoji;
	}
}
