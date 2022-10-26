## 🚀 기능 요구 사항

포비와 크롱이 페이지 번호가 1부터 시작되는 400 페이지의 책을 주웠다. 책을 살펴보니 왼쪽 페이지는 홀수, 오른쪽 페이지는 짝수 번호이고 모든 페이지에는 번호가 적혀있었다. 책이 마음에 든 포비와 크롱은 페이지 번호 게임을 통해 게임에서 이긴 사람이 책을 갖기로 한다. 페이지 번호 게임의 규칙은 아래와 같다.

- [x] 책을 임의로 펼친다.
  - [x] 책을 올바르게 폈는지 검증한다. 
    - [x] pobi와 crong의 길이가 2인지 검증한다.  
    - [x] 펼친 페이지가 1 ~ 400 사이인지 검증한다.  
    - [x] 왼쪽 페이지는 홀수, 오른쪽 페이지는 짝수인지 검증한다. 
  - [x] 왼쪽 페이지 숫자와, 오른쪽 페이지 숫자의 정보를 가지고 있는 Page 클래스를 만든다.
  
- [ ] 왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
  - [ ] Page 클래스에 큰 수를 구하는 메소드를 만든다. 
    - [ ] 숫자를 자리수로 쪼개서 List 형태로 반환한다.
    - [ ] 자리수로 쪼갠 숫자들을 더한다.
    - [ ] 자리수로 쪼갠 숫자들을 곱한다.
    - [ ] 자리수를 합한 숫자와 자리수를 곱한 숫자를 파라미터로 받아 더 큰 수를 반환하는 메소드를 만들어 큰 수를 반환한다. 
        
- [ ] 오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
  - [ ] 왼쪽 페이지에서 사용했던 큰 수를 구하는 메소드를 재사용한다. 
 
- [ ] 2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
  - [ ] 왼쪽 페이지의 큰 값과 오른쪽 페이지의 큰 값을 파라미터로 받아 더 큰 수를 반환하는 메소드를 재사용해서 큰 수를 반환한다.

- [ ] 점수를 비교해 가장 높은 사람이 게임의 승자가 된다.
  - [ ] Page클래스에 Comparable의 compareTo 메소드를 구현하여 게임의 승자를 가린다.
    - [ ] pobi의 숫자가 더 크면 return 1
    - [ ] crong의 숫자가 더 크면 return 2
    - [ ] 둘의 숫자가 똑같다면 return 0 
    - [ ] 예외는 return -1 


### 제한사항

- pobi와 crong의 길이는 2이다.
- pobi와 crong에는 [왼쪽 페이지 번호, 오른쪽 페이지 번호]가 순서대로 들어있다.

### 실행 결과 예시

| pobi | crong | result |
| --- | --- | --- |
| [97, 98] | [197, 198] | 0 |
| [131, 132] | [211, 212] | 1 |
| [99, 102] | [211, 212] | -1 |

## 🎯 프로그래밍 요구 사항

- JDK 11 버전에서 실행 가능해야 한다. **JDK 11에서 정상적으로 동작하지 않을 경우 0점 처리한다.**
- `build.gradle`을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- 프로그램 종료 시 `System.exit()`를 호출하지 않는다.
- 프로그램 구현이 완료되면 `ApplicationTest`의 모든 테스트가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**
- 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다.

---

## ✏️ 과제 진행 요구 사항

- 미션은 [java-onboarding](https://github.com/woowacourse-precourse/java-onboarding) 저장소를 Fork & Clone해 시작한다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고한다.