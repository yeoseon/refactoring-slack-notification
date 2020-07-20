package me.yeoseon.dj.domain;

public class SlackEnvironment {
    private String targetUrl;
    private String channel;

    public SlackEnvironment(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
