package me.yeoseon.dj.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Slack에 메시지 전송 요청을 위한 Json Message 객체
 */
@Getter
@Setter
@NoArgsConstructor
public class SlackMsgRequestDto {

	private String channel;
	private String text; // 오전/오후 음악 리스트 입니다
	private List<SlackAttachmentDto> attachments;
	private String username;
	@JsonProperty("icon_emoji") private String iconEmoji;
	
}
