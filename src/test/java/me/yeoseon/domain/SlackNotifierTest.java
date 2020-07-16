package me.yeoseon.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

public class SlackNotifierTest {

    @Test
    @DisplayName("REST API를 이용하여 slack에 메시지를 Notify 한다.")
    void notifyMessage() {
        String targetUrl = "https://hooks.slack.com/services/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";
        String request = "{\n\"text\": \"안녕\"\n}";

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        restTemplate.postForEntity(targetUrl, request, String.class);
    }
}
