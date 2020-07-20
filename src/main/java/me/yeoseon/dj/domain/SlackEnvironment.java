package me.yeoseon.dj.domain;

public class SlackEnvironment {
    private String targetUrl;

    public SlackEnvironment(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}
