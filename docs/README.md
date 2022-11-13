# 기능 목록 ver 1.3.4
<hr>

### 예외처리 상황
- 구입금액
  - [x] 입력 값이 숫자가 아닌 경우 - UserLotto
  - [x] 구입금액이 1000 으로 나누어 떨어지지 않는 경우 - UserLotto


- 당첨 번호
  - [x] 입력 값이 숫자가 아닌 경우 - Lotto
  - [x] 번호가 1 ~ 45 사이가 아닌 경우 - Lotto
  - [x] 번호가 6개가 아닌 경우 - Lotto
  - [x] 중복 번호가 당첨 번호 내에 존재하는 경우 - Lotto

- 보너스 번호
  - [x] 입력 값이 숫자가 아닌 경우 - Bonus
  - [x] 번호가 1 ~ 45 사이가 아닌 경우 - Bonus
  - [x] 번호가 당첨 번호랑 중복되는 경우 - Bonus

<hr>

### 기능 구현 목록

- [ ] 당첨 정보 enum 생성
- [ ] 출력 기능
  - [x] 구입 금액 입력받기 문구 출력 - Guide
  - [x] 구매 개수 출력 - Guide
  - [x] 구매한 복권 번호 목록 출력 - Guide
  - [x] 당첨 번호 입력받기 문구 출력 - Guide
  - [x] 보너스 번호 입력받기 문구 출력 - Guide
  - [ ] 당첨 통계 출력 - UserLotto
- [ ] 입력 기능
  - [x] 입력받은 구입금액에 대한 생성자 - UserLotto
    - [x] String 형식에 대한 int 형변환 - Guide
  - [x] 입력받은 당첨 번호에 대한 생성자 - Lotto
    - [x] String 형식인 당첨 번호를 콤마로 구분하여 List\<String>로 변환 - Guide
    - [x] List\<String> 을 List\<Integer>로 변환
  - [x] 입력받은 보너스 번호에 대한 생성자 - Bonus
    - [x] String 형식에 대한 int 형변환 - Guide

- [x] 로또 번호 접근자 - Lotto
- [ ] 보너스 번호 접근자 - Bonus
- [x] 구매 개수 계산 - UserLotto
- [x] 구매 리스트 생성(랜덤) - NumberGenerator
- [ ] 몇 개의 번호가 당첨 번호와 일치하는지 확인 - Judgment
- [ ] 보너스 번호 일치 여부 확인 - Judgment
- [ ] 수익률 계산 - UserLotto