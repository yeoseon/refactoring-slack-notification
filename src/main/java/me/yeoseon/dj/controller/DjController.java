package me.yeoseon.dj.controller;

import me.yeoseon.dj.dto.PlayDto;
import me.yeoseon.dj.service.DJSlackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/entertainment/dj")
public class DjController {

    @Autowired
    private DJSlackService slackService;

    @GetMapping("/sendToSlack")
    public ResponseEntity<String> sendToSlack(@RequestParam("playTimeZone")
                                                      String playTimeZone) throws Exception {
        List<PlayDto> playList = playHistoryService.getPlayList(playTimeZone);
        slackService.sendMessage(playList);
        return new ResponseEntity<String>("Success to slack notifications", HttpStatus.OK);
    }
}
