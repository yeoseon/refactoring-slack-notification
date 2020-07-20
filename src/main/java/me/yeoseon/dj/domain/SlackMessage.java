package me.yeoseon.dj.domain;

import me.yeoseon.dj.dto.SlackMsgRequestDto;

public class SlackMessage {
    private String message;

    public SlackMessage(String message) {
        this.message = message;
    }

    public SlackMsgRequestDto getRequest() {
        SlackMsgRequestDto request = new SlackMsgRequestDto();
        //TODO: Environment 에서 가져오도록
        return request;
    }

    private void convertMessage() {
    }
}
