-- 05. DDL_Sequence.sql

​

-- *오라클 - 시퀀스(Sequence)

-- 테이블 내외 중복되지 않는 숫자를 자동으로 생성하는 자동 번호 발생기

-- 테이블 생성 후 시퀀스(일렬번호)를 따로 만들어야 한다.

​

-- 생성방법

-- CREATE SEQUENCE 시퀀스이름 START WITH 시작숫자 INCREMENT BY 증가량;

​

-- 주로 NUMBER 형식에 기본키값으로 사용합니다.

-- 일렬번호정도로 이해하셔도 무방합니다.

-- NUMBER(자리수) : 자료형의 자리수가 몇자리냐에 따라 그 만큼 숫자가 증가할 수 있습니다.

​

-- [1] 시퀀스 생성

CREATE SEQUENCE book_seq START WITH 1 increment BY 1;

​
-- [2] 테이블에 레코드를 추가합니다.

INSERT INTO book_list values(book_seq.nextVal, '일곱해의 마지막', 2020, 12150, 2000, 'all');

INSERT INTO book_list values(book_seq.nextVal, '봉제인형 살인사건', 2019, 13150, 2000, '18');

INSERT INTO book_list values(book_seq.nextVal, '쇼코의 미소', 2023, 13420, 2000, '12');

-- [3] 시퀀스 수정 : 최대 증가값을 14까지로 제한

ALTER SEQUENCE book_seq maxvalue 14;

-- [4] 시퀀스 삭제
DROP SEQUENCE book_seq;

-- [5] 시퀀스 재생성 : 다음 숫자부터 시작하게 하여 기존 레코드와 중복되지 않게 합니다.
CREATE SEQUENCE book_seq start with 15 increment by 1;

-- 1부터 1씩 늘어나는 member_seq 와 rent_seq 를 생성해주세요.
CREATE SEQUENCE member_seq start with 1 increment by 1;
​CREATE SEQUENCE rent_seq start with 1 increment by 1;

select * from book_list;

