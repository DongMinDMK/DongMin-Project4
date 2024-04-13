-- 04_DDL_Alter.sql

​

-- 생성

CREATE TABLE 테이블이름();

CREATE USER scott identified by tigher;

​

-- 수정

ALTER TABLE 테이블이름<수정내용>;

ALTER USER 유저이름 identified by 비밀번호

​

-- 1. 필드명의 변경

ALTER TABLE 테이블이름 RENAME COLUMN 변경전필드 이름 TO 변경후필드이름;

​

-- book_list 테이블의 subject 필드명을 title로 수정합니다.

ALTER TABLE book_list RENAME COLUMN subject to title;

​

select * from book_list;

​

-- 반대로 title 필드명을 subject 필드명으로 수정합니다.

ALTER TABLE book_list RENAME COLUMN title to subject;

​

-- book_list 의 out_price 필드의 이름을 rent_price로 수정하세요

ALTER TABLE book_list RENAME COLUMN out_price to rent_price;

select * from book_list;

​

-- member_list 테이블의 member_name 필드를 name으로 변경하세요

ALTER TABLE member_list RENAME COLUMN member_name to name;

select * from member_list;

​

-- rent_list 테이블의 rent_date 필드를 rentdate 로 변경하세요

ALTER TABLE rent_list RENAME COLUMN rent_date to rentdate;

​

-- rent_list 의 idx 를 num_seq 로 변경하세요

ALTER TABLE rent_list RENAME COLUMN idx to num_seq;

​

​

-- 2. 필드 자료형의 변경

-- ALTER TABLE 테이블명 MODIFY 필드명 자료형 [디폴트값이나 제약사항]

​

-- VARCHAR2(12) 였던 member_list 테이블의 name 필드를 VARCHAR2(30) 으로 변경

ALTER TABLE member_list MODIFY NAME VARCHAR2(30);

​

​

-- book_list의 book_num 필드를 number(5) 로 자료형 변경(기본키를 변경)

ALTER TABLE book_list MODIFY book_num NUMBER(5);

select * from book_list;

​

-- member_list 의 member_num 필드를 number(5) 로 자료형 변경(기본키를 변경)

ALTER TABLE member_list MODIFY member_num NUMBER(5);

​

-- rent_list 의 b_num 필드를 number(5) 로 자료형 변경(외래키를 변경)

ALTER TABLE rent_list MODIFY b_num NUMBER(5);

​

-- rent_list 의 m_num 필드를 number(5) 로 자료형 변경(외래키를 변경)

ALTER TABLE rent_list MODIFY m_num NUMBER(5);

​

-- 외래키로 연결되어서 참조되고, 참조하고 있는 필드들은 위의 명령으로 수정이 바로 불가능합니다.

-- 가능하게 하려면 외래키 조건을 수정하여 없애버리고, 참조되는 필드와 참조하는 필드를

-- 모두 수정한 후 외래키 제약 조건을 다시 설정합니다.

-- ALTER 명령에 의해서 제약조건을 수정 또는 삭제하는 명령을 아래에서 학습합니다.

​

-- 3. 필드의 추가

-- ALTER TABLE 테이블명 ADD 필드명 자료형

​

-- book_list 구매등급을 저장할 수 있는 grade 필드를 VARCHAR2(15) 로 추가

ALTER TABLE book_list ADD grade VARCHAR2(15);

​

-- member_list 에 성별(gender) 필드를 VARCHAR2(3) 으로 추가

ALTER TABLE member_list ADD gender VARCHAR2(3);

​

-- member_list 에 나이(age) 필드를 number(2) 로 추가

ALTER TABLE member_list ADD age NUMBER(2);

​

SELECT * FROM member_list;

​

​

-- 4. 필드의 삭제

-- ALTER TABLE 테이블명 DROP COLUMN 필드명

​

-- member_list 테이블에서 성별 필드 제거

​

-- ALTER TABLE member_list DROP COLUMN gender;

​

-- 5. 제약조건의 추가 / 삭제

​

-- 필드 레벨의 제약조건의 수정 -> modify 명령을 통해서 수정/생성/삭제 합니다.

-- member_list 의 gender 필드에 'M' 또는 'F'  둘 중에 하나만 입력되게 제약조건을 설정

ALTER TABLE member_list MODIFY gender VARCHAR2(3) CHECK(gender = 'M' or gender = 'F');

ALTER TABLE member_list MODIFY gender VARCHAR2(3) CHECK(gender IN('M', 'F'));

-- gender in('F' , 'M') : gender 필드값이 in 함수 안에 있는 값들일 때만 true 를 결과로 취함.

​

-- 테이블 레벨의 제약조건 생성

-- 추가 : ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 제약조건식

-- 테이블 LEVEL 의 제약조건은 위의 명령 형식으로 제약조건 이름과 함께 추가합니다.

​

-- member_list 테이블의 나이(age) 필드에 120살이 초과 되는 나이는 입력되지 못하게 제약 조건 추가

ALTER TABLE member_list ADD CONSTRAINT CHECK_AGE CHECK(age <= 120);

​

-- 테이블 레벨의 제약조건 삭제

-- 삭제 : ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명

​

-- rent_list 테이블의 b_num 에 걸려 있는 외래키 제약조건 제거(fk1)

ALTER TABLE rent_list DROP CONSTRAINT fk1;

​

-- rent_list 테이블의 m_num 에 걸려 있는 외래키 제약조건 제거(fk2)

ALTER TABLE rent_list DROP CONSTRAINT fk2;

​

-- rent_list 테이블의 기본키 제거

ALTER TABLE rent_list DROP CONSTRAINT rent_list_pk;

​

-- 다시 위에서 했던 속성 자료형 변경

​

-- book_list의 book_num 필드를 number(5) 로 자료형 변경

ALTER TABLE book_list MODIFY book_num NUMBER(5);

select * from book_list;

​

-- member_list 의 member_num 필드를 number(5) 로 자료형 변경

ALTER TABLE member_list MODIFY member_num NUMBER(5);

​

-- rent_list 의 b_num 필드를 number(5) 로 자료형 변경

ALTER TABLE rent_list MODIFY b_num NUMBER(5);

​

-- rent_list 의 m_num 필드를 number(5) 로 자료형 변경

ALTER TABLE rent_list MODIFY m_num NUMBER(5);

​

-- rent_list 의 기본키(rent_pk)를 num_seq 로 설정

ALTER TABLE rent_list ADD CONSTRAINT rent_pk PRIMARY KEY(num_seq);

​

-- rent_list 의 외래키 fk1, fk2 재설정

ALTER TABLE rent_list ADD CONSTRAINT fk1 FOREIGN KEY(b_num) REFERENCES book_list(book_num);

ALTER TABLE rent_list ADD CONSTRAINT fk2 FOREIGN KEY(m_num) REFERENCES member_list(member_num);

​

​

-- 테이블명 : ORDERS1

-- 필드 :

-- ORDER_ID NUMBER(12, 0)   ORDER_DATE DATE   

-- ORDER_MODE    VARCHAR2(8)

-- CUSTOMER_ID   NUMBER(6,0)    ORDER_STATUS  NUMBER(2,0)  ORDER_TOTAL NUMBER(8,2)

-- SALES_REP_ID   NUMBER(6,0)   PROMOTION_ID   NUMBER(6,0)

​

​

-- 제약사항

-- 기본키 ORDER_ID - 테이블레벨(제약명 : pk_order)

-- ORDER_MODE 에는 'direct', 'online' 만 입력가능 - 테이블레벨(제약명 : ck_order_mode)

-- ORDER_TOTAL 의 디폴트 값은 0 - 필드레벨

-- ORDER_DATE 디폴트 값 오늘 날짜 - 필드레벨

​

CREATE TABLE ORDERS1 (

   ORDER_ID NUMBER(12,0),

   ORDER_DATE DATE DEFAULT sysdate,

   ORDER_MODE VARCHAR2(8),

   CUSTOMER_ID NUMBER(6,0),

   ORDER_STATUS NUMBER(2,0),

   ORDER_TOTAL NUMBER(8,2) DEFAULT 0,

   SALES_REP_ID NUMBER(6,0),

   PROMOTION_ID NUMBER(6,0),

   

   CONSTRAINT pk_order PRIMARY KEY(ORDER_ID),

   CONSTRAINT ck_order_mode CHECK(ORDER_MODE IN('direct', 'online'))

);

​

-- CUSTOMER_ID 필드명을 CUSTOMER_NUMBER 로 수정

ALTER TABLE ORDERS1 RENAME COLUMN CUSTOMER_ID TO CUSTOMER_NUMBER;

​

-- Promotion_ID 값은 10000~99999 사이의 값만 저장 가능

-- ALTER TABLE ORDERS1 MODIFY PROMOTION_ID NUMBER(6,0) CHECK(PROMOTION_ID >= 10000 AND PROMOTION_ID <= 99999);

ALTER TABLE ORDERS1 MODIFY PROMOTION_ID NUMBER(6,0) CHECK(PROMOTION_ID BETWEEN 10000 AND 99999);

​

​

-- 테이블의 복사

CREATE TABLE ORDERS2 AS SELECT * FROM ORDERS1;

​

-- 테이블의 제거

DROP TABLE ORDERS;

​

SELECT * FROM ORDERS1;

SELECT * FROM ORDERS2;

​