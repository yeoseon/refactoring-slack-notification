package me.yeoseon.dj.domain;

public class SlackMessage {
    private String message;

    public SlackMessage(String message) {
        this.message = message;
    }

    public String getRequest() {
    //TODO: String이 아닌 DTO 또는 일급 컬렉션 이용하도록 수정
        String request = "{\n\"text\": \"안녕\"\n}";

        return request;
    }

    private void convertMessage() {
    }
}
