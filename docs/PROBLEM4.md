## 🚀 기능 요구 사항

어느 연못에 엄마 말씀을 좀처럼 듣지 않는 청개구리가 살고 있었다. 청개구리는 엄마가 하는 말은 무엇이든 반대로 말하였다.

엄마 말씀 word가 매개변수로 주어질 때, 아래 청개구리 사전을 참고해 반대로 변환하여 return 하도록 solution 메서드를 완성하라.

| A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Z | Y | X | W | V | U | T | S | R | Q | P | O | N | M | L | K | J | I | H | G | F | E | D | C | B | A |

- [x] word를 검증한다.
  - [x] 길이가 1이상 1,000 이하인지 검증한다.
- [x] 알파벳이면 반대로 변환한다.
  - [x] 대문자이면 대문자로 변환한다.
    - [x] 기준값(아스키코드)을 정한다. (A + Z) / 2;
    - [x] 변환되는값 = 현재 알파벳값 + (기준값 - 현재 알파벳값) * 2 + 1
  - [x] 소문자면 소문자로 변환한다. 
    - [x] 기준값(아스키코드)을 정한다. (a + z) / 2;
    - [x] 변환되는값 = 현재 알파벳값 + (기준값 - 현재 알파벳값) * 2 + 1
- [x] 변환된 word를 반환한다.

### 제한사항

- word는 길이가 1 이상 1,000 이하인 문자열이다.
- 알파벳 외의 문자는 변환하지 않는다.
- 알파벳 대문자는 알파벳 대문자로, 알파벳 소문자는 알파벳 소문자로 변환한다.

### 실행 결과 예시

| word | result |
| --- | --- |
| "I love you" | "R olev blf" |
