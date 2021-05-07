# git-commit-history-management
Git 의 History 관리 전략을 수립하기 위한 테스트 저장소

git의 history를 깔끔하게 관리하기 위해서는 팀별로 정해진 규칙을 따라야 한다.

브랜치 종류, 병합 방법(merge, squash&merge, rebase) 선정, 커밋 메세지 작성 규칙 등의 통일된 규약이 필요하다.

# 1. Git branch 전략

![git branch 전략](https://github.com/skysoo1111/Settings/tree/master/99Img/git-branch.png)

## 1-1. master 브랜치로부터 develop 브랜치 생성
## 1-2. 모든 기능 개발은 develop 브랜치에서 feature 브랜치를 생성한 후 진행
## 1-3. 기능 개발이 완료된 feature 브랜치는 develop 브랜치로 Merge Request 요청 및 셀프 승인하고 개발 서버에서 테스트 수행
## 1-4. master 브랜치로부터 버전에 맞는 release 브랜치 생성 (v1.0 시작)
## 1-5. 기능 검증이 끝났고 배포 버전에 포함된 기능에 대해서 feature -> release 브랜치로 Merge Request 요청 (Optional, 코드 리뷰)
## 1-6. 코드 리뷰 이상 없다면 담당자 승인하고 스테이징 서버에서 QA 수행
## 1-7. 만약, v0.1 에 대해 버그가 발견되었다면 Hot-fix 브랜치를 생성한 뒤 빠르게 Bug Fix 수행 및 운영 배포
## 1-8. v1.0 배포에 대한 QA 검증이 완료되었다면 master, develop 브랜치에 각각 merge 수행


# 2. 규칙

## 2-1. feature 브랜치는 항상 develop 브랜치로부터 생성한다.
## 2-2. 개발 서버에서는 배포 버전과 상관 없이 자유롭게 merge 하고 테스트를 수행할 수 있다.
## 2-3. 검증이 완료된 feature 브랜치는 직접 release 브랜치로 merge 요청한다.