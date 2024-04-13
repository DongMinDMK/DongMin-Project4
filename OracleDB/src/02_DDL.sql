-- 02_DDL.sql

-- DDL(Data Definition Language) 데이터 정의어

-- 테이블의 생성 CREATE

​

CREATE TABLE 테이블명(

   필드명1 데이터타입 [DEFAULT 값 OR 제약조건], 

   필드명2 데이터타입 [DEFAULT 값 OR 제약조건],

   필드명3 데이터타입 [DEFAULT 값 OR 제약조건],

   필드명4 데이터타입 [DEFAULT 값 OR 제약조건],

   ...

   필드명 데이터타입 [DEFAULT 값 OR 제약조건]

);

​

​

​

-- 도서대여점의 도서목록 테이블의 생성

-- 필드 : booknum, subject, makeyear, inprice, outprice

-- 자료형 : booknum(문자5자리), subject(문자30), makeyear(숫자4),

--          inprice(숫자6), outprice(숫자6)

-- 제약조건 : booknum(not null), subject(not null), makeyear(),

--              inprice(), outprice()

-- 테이블명 : booklist

​

CREATE TABLE book_list(

   book_num VARCHAR2(5) NOT NULL,

   subject VARCHAR2(30) NOT NULL,

   make_year NUMBER(4),

   in_price NUMBER(6),

   out_price NUMBER(6)

);

​

SELECT * FROM book_list;

​

DROP TABLE book_list;

​

CREATE TABLE book_list(

   book_num VARCHAR2(5),

   subject VARCHAR2(30) NOT NULL,

   make_year NUMBER(4),

   in_price NUMBER(6) NOT NULL,

   out_price NUMBER(6) NOT NULL,

   

   CONSTRAINT book_list_pk primary key(book_num)

   

   -- 필드명 옆에 현재 필드에만 적용하는 제약조건을 필드레벨의 제약이라고 합니다.

   -- 아래처럼 쓰는 건 테이블 레벨의 제약조건입니다.

);

​

-- 기본키(Primary Key) : 테이블을 구성하는 필드들 중에서 갖는 값들이 빈칸(NULL) 이 없고,

-- 서로 다른 값(유일한 값)들을 갖고 있어 레코드들을 유일하게 구분해 낼 수 있는 필드

-- 테이블을 구성하는 필드 들 중 자격이 되는  필드 중 하나에 부여하는 테이블의 대표값

-- 기본키를 지정함으로써 기본키가 지정하지 않았을 때 발생할 수 있는 오류들을 미연에 방지할 수 있다.

-- 기본키로 결함을 없애는 것. 그래서 결함없이 유지되는 것을 "개체 무결성" 이라고 부릅니다.

​

​

-- CREATE TABLE 명령의 세부규칙

-- 1. 테이블의 이름은 객체를 의미할 수 있는 적합한 이름을 사용합니다.(자바의 변수이름과 비슷)

-- 2. 다른 테이블과 이름이 중복되지 않게 정합니다.(같은 아이디로 로그인했을 때 중복)

-- 3. 한 테이블 내에서 필드이름도 중복되지 않게 함.

-- 4. 각 필드들은 "," 로 구분하여 생성함.

-- 5. CREATE 를 비롯한 모든 SQL 명령은 ";" 로 마칩니다.

-- 6. 필드명 뒤에 DATATYPE 은 반드시 지정하고 [] 안에 내용은 해당내용이 있을 때 작성하며 생략 가능

-- 7. 예약어 명령어 등을 테이블명과 필드명으로 쓸 수 없음.

-- 8. 테이블 생성 시 대/소문자 구분은 하지 않음(기본적으로 테이블이나 컬럼명은 대문자로 만들어짐)

--     CREATE TABLE

-- 9. 보통은 데이터형식과 용량(크기)를 지정하는데, DATE 데이터 형식은 유형을 별도로 크기를 지정하지 않음.

-- 10. 문자데이터의 DATATYPE->VARCHAR2(10), NUMBER(4)

-- 11. 문제 데이터 유형은 반드시 가질 수 있는 최대 길이를 표시해야 함.

-- 12. 숫자 데이터 형식은 BYTE 수로 표현하지 않고, 자릿수로 표현 NUMBER(4) -> 4자리 숫자(0~9999)

-- 13. 컬럼(필드) 와 컬럼(필드)의 구분은 콤마로 하되, 마지막 컬럼이나 CONSTRAINT 를 작성 후에는 콤마를 찍지 않음.

​

​

CREATE TABLE member_list(

   member_num VARCHAR2(5) NOT NULL,

   member_name VARCHAR2(12) NOT NULL,

   phone VARCHAR2(13) NOT NULL,

   birth DATE,

   b_point NUMBER(6),

   

   CONSTRAINT member_list_pk primary key(member_num)

);

​

SELECT * FROM member_list;

​

-- 외래키(FORIEGN KEY) : 테이블 간의 필수 포함 관계에 있어

-- 상대 테이블의 특정 필드값을 참조하면서 없는 값을 사용할 수 없도록 하는 규칙.

-- 외래키로 유지되는 무결성을 "참조 무결성" 이라고 부릅니다.

-- 예를 들면 book_list 에 존재 하지 않은 도서의 번호가 rent_list 의 빌려간 도서의 번호로 등록하지 못하게 하는 것을 말합니다.

​

​

CREATE TABLE rent_list(

   idx NUMBER(3), -- 대여기록번호

   rent_date DATE DEFAULT sysdate, -- 대여날짜

   -- rent_seq NUMBER(3) 하나의 날짜 안에서 지정된 순번

   b_num VARCHAR2(5) NOT NULL, -- 대여해 간 도서번호

   m_num VARCHAR2(5) NOT NULL, -- 대여한 회원의 회원번호

   discount NUMBER(4) DEFAULT 500, -- 할인 금액

   -- CONSTRAINT rent_list_pk PRIMARY KEY(rent_date, rent_seq)

   CONSTRAINT rent_list_pk PRIMARY KEY(idx),

   CONSTRAINT fk1 FOREIGN KEY(b_num) REFERENCES book_list(book_num),

   -- 현재 테이블의 b_num 필드는 book_list 테이블의 book_num 필드값을 참조합니다.

   CONSTRAINT fk2 FOREIGN KEY(m_num) REFERENCES member_list(member_num)

   -- 현재 테이블의 m_num 필드는 member_list 테이블의 member_num  필드값을 참조합니다.

);

​

SELECT * FROM rent_list;

​

-- 외래키의 참조 대상이 되는 필드는 그 쪽 테이블의 기본키여야 합니다.

​

-- 제약조건(CONSTRAINT)

-- PRIMARY KEY

-- 테이블에 저장된 레코드를 고유하게 식별하기 위한 키, 하나의 테이블에 하나의 기본키만 정의할 수 있습니다.

-- 여러 필드가 조합된 기본키 생성이 가능합니다.

-- 기본키는 중복된 값을 가질 수 없으면서 동시에 빈칸도 있을 수 없습니다.

-- PRIMARY = UNIQUE + NOT NULL

-- UNIQUE KEY

-- 테이블에 저장된 행 데이터를 고유하게 식별하기 위한 고유키를 정의 합니다.

-- 단 NULL 은 고유키 제약의 대상의 아니므로, NULL 값을 가진 행이 여러개가 UNIQUE KEY

-- 제약에 위반하지는 않습니다.

-- NOT NULL

-- 비어 있는 상태, 아무것도 없는 상태를 허용하지 않습니다 - 입력 필수

-- CHECK

-- 입력할 수 있는 값의 범위를 제한한다. CHECK 제약으로는 TRUE OR FALSE 로 평가할 수 있는 논리식을 지정합니다.

-- FOREIGN KEY

-- 관계형 데이터베이스에서 테이블간에 관계를 정의하기 위해 기본키를 다른 테이블의 외래키로 복사하는 경우 외래키가 생성됩니다. - 참조무결성 제약 옵션이 생성 -