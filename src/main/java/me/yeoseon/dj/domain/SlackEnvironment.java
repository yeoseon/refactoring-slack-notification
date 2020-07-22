package me.yeoseon.dj.domain;

public class SlackEnvironment {
    private String targetUrl;
    private String channel;

    public SlackEnvironment(String targetUrl, String channel) {
        this.targetUrl = targetUrl;
        this.channel = channel;
    }

    public String getTargetUrl() {
        return targetUrl;
    }
}
