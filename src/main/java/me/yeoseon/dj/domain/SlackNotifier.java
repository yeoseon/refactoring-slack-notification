package me.yeoseon.dj.domain;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

public class SlackNotifier {
    private SlackEnvironment slackEnvironment;

    public SlackNotifier() {
    }

    public SlackNotifier(SlackEnvironment slackEnvironment) {
        this.slackEnvironment = slackEnvironment;
    }

    public void notifyMessage(String message) {
//        String targetUrl = slackEnvironment.getTargetUrl();
        String targetUrl = "https://hooks.slack.com/services/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";
        String request = "{\n\"text\": \"안녕\"\n}";

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        restTemplate.postForEntity(targetUrl, message, String.class);
    }
}
