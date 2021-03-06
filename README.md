# refactoring-slack-notification
회사에서 사이드 프로젝트로 만들었던 [slack notification 기능(private)](https://finlab.bwg.co.kr/gitlab/archsil/finlabop/fos/-/merge_requests/21/diffs?tab=diffs)을 리팩토링한다.  
해당 기능만 Springboot 프로젝트로 하나 더 만들어 독립적으로 실행할 수 있도록 세팅 후 리팩토링을 진행한다.  

# 요구사항  

1. 스케줄러를 통해 음악 재생 시간이 되면 Slack 메시지를 보낸다.  

# 설계 내용  

## 테스트 코드 목록  


## 객체 및 책임 설계  
- SlackNotifier : Slack 메시지 알리미 객체 
    - 인자로 메시지 객체와 환경 설정 객체를 받아 Slack으로 표시해준다.
    - SlackEnviornment와 SlackMessage를 멤버변수로 갖는다. (생성자)
- SlackEnvironment : Slack 메시지 알림을 위한 환경 설정 객체
    - Properties에 있는 정보를 토대로 환경 설정 값을 가져온다. 

# 참고 자료

* [Sending messages using Incoming Webhooks](https://api.slack.com/messaging/webhooks)  

[slack notification 기능(private)] 반영 완료

# 추가 리팩토링

1. SlackAttachments 로 List<SlackAttachment>를 Wrapping 해서 생성자로 처리하기 
```
package ...

import ....PlayDto;

import java.util.List;

public class SlackAttachments {
    private List<SlackAttachment> slackAttachments;

    public SlackAttachments(List<PlayDto> playList) {
        int playItemNumber = 0;
        for(PlayDto playItem : playList) {
            this.slackAttachments.add(new SlackAttachment(playItem, playItemNumber));
            playItemNumber++;
        }
    }
}

```
