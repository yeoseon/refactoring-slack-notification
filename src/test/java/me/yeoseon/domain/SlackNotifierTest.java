package me.yeoseon.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

public class SlackNotifierTest {

    @Test
    @DisplayName("REST API를 이용하여 lack에 메시지를 Nofity 한다.")
    void notifyMessage() {
        String targetUrl = "https://hooks.slack.com/services/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1";
        String request = "{\n" +
                "    \"text\": \"Hello, world.\"\n" +
                "}";

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        restTemplate.postForEntity(targetUrl, request, String.class);
    }
}
