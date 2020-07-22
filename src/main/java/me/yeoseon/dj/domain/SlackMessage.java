package me.yeoseon.dj.domain;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.yeoseon.dj.Constants;

/**
 * Slack에 메시지 전송 요청을 위한 Json Message 객체
 */
public class SlackMessage {

	public static final String JSON_PROCESSION_ERROR = "Json 변환 과정에 문제가 발생했습니다. 객체를 확인해주세요.";

	private String channel;
	private String text; //
	private List<SlackAttachment> attachments;
	private String userName;
	private String iconEmoji;

	// Test용 생성자
	public SlackMessage() {
		this.channel = Constants.CHANNEL;
		this.userName = Constants.USER_NAME;
		this.text = Constants.TEST_TEXT_MAIN;
		this.attachments = Constants.TEST_ATTACHMENTS;
		this.iconEmoji = Constants.ICON_EMOJI;
	}

	public SlackMessage(String channel, String userName, String text, List<SlackAttachment> attachments, String iconEmoji) {
		this.channel = channel;
		this.userName = userName;
		this.text = text;
		this.attachments = attachments;
		this.iconEmoji = iconEmoji;
	}

	public String convertSlackMessageToJson() {
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			return objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			throw new IllegalArgumentException(JSON_PROCESSION_ERROR);
		}

	}
}
