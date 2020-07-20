package me.yeoseon.dj.domain;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

public class SlackNotifier {
    private SlackEnvironment slackEnvironment;

    public SlackNotifier(SlackEnvironment slackEnvironment) {
        this.slackEnvironment = slackEnvironment;
    }

    public void notifyMessage(String message) {
        String targetUrl = slackEnvironment.getTargetUrl();
        SlackMessage slackMessage = new SlackMessage(message);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        restTemplate.postForEntity(targetUrl, slackMessage.getRequest(), String.class);
    }
}
