# java-calculator-final - 최종 코테 대비..

<br />

## 문제
입력 문자열에서 숫자를 추출하여 더하는 계산기
- 쉼표, 콜론을 구분자로 가지는 문자열
  - 구분자를 기준으로 분리하여 각 숫자의 합 반환
- 기본 구분자 외 커스텀 구분자 지정
  - 문자열 앞 부분의 "//", "\n" 사이의 "문자" 커스텀 구분자로 사용
- 잘못된 값 입력
  - `IllegalArgumentException` 발생 후 종료

## 기능 구현
### 기능
#### 기본 기능 구현 : 1시간 21분
- [x] 문자열 (구분자와 양수로 구성)
  - [x] 커스텀 구분자 확인 및 추출 
  - [x] 구분자 기준으로 구분
  - [x] 구분한 숫자 추출
  - [x] 숫자의 합 반환

### 입력
- [x] 문자열 입력받기
  - 커스텀 구분자 있는 경우
  - 커스텀 구분자 없는 경우

### 출력
- [x] 결과 출력하기

<br />

## 생각해볼 예외 사항들 💀
### 기능 및 입력
- [ ] 예외1. 구분자가 없는 경우
  - 숫자 하나만 입력한 것으로 처리
- [ ] 예외2. 구분자를 2개 이상 연속 사용한 경우
- [ ] 예외3. 구분한 숫자가 양수가 아닌 경우
  - 음수, 0, 문자, null, 빈 값인 경우
- [ ] 예외4. 구분한 숫자의 값이 너무 큰 경우
- [ ] 예외5. 커스텀 구분자 시작 및 끝 조건이 잘못된 경우
- [ ] 예외6. 커스텀 구분자 사이 문자가 아닌 경우

<br />

---
- 구분자
  - 기본 구분자
    - 쉼표, 콜론
  - 커스텀 구분자
    - "문자열 앞 부분" //, \n 사이의 "문자"
      - 하나의 커스텀 구분자만 허용

생각해볼 수 있는 객체
1. 계산기
2. 구분자
3. 숫자