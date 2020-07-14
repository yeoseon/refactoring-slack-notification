# refactoring-slack-notification
회사에서 사이드 프로젝트로 [만들었던 slack notification 기능](https://finlab.bwg.co.kr/gitlab/archsil/finlabop/fos/-/merge_requests/21/diffs?tab=diffs)을 리팩토링한다.  
해당 기능만 Springboot 프로젝트로 하나 더 만들어 독립적으로 실행할 수 있도록 세팅 후 리팩토링을 진행한다.  

# 요구사항  

1. 스케줄러를 통해 음악 재생 시간이 되면 Slack 메시지를 보낸다.  

# 설계 내용  


