package me.yeoseon.dj.domain;

public class SlackEnvironment {
    private static final String TARGET_URL = "https://hooks.slack.com/services/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";
    private String targetUrl;

    public SlackEnvironment() {
        this.targetUrl = TARGET_URL;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}
