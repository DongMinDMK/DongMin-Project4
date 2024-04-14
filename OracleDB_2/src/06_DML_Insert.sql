-- 06_DML_Insert.sql

​

-- DML(Data Management Language) 데이터 조작 언어

​

-- 테이블에 레코드를 조작(추가, 수정, 삭제, 조회) 하기 위한 명령어들

-- INSERT(추가)

-- UPDATE(수정)

-- DELETE(삭제)

-- SELECT(조회 및 선택)

​

-- [1] 샘플 테이블 생성

CREATE TABLE exam01(

   dept_no NUMBER(2),

   d_name varchar2(15),

   loc varchar2(15)

);

​

select * from exam01;

​

-- [2] 레코드 추가

​

-- 레코드 추가 방법 #1

insert into 테이블이름(필드명1, 필드명2, 필드명3 ....) values(값1, 값2, 값3 ......);

-- 레코드 추가 방법 #2

insert into 테이블이름 values(값1, 값2, 값3 .....);

​

-- #1과 #2의 차이점

-- #1 : 필드명과 입력되어야 하는 값들이 1:1 매칭되어 입력됩니다.

--          필드명의 순서는 반드시 지켜야 하는 것은 아니지만 나열된 필드명 대로 값들의 순서는 맞춰서 입력합니다.

​

insert into exam01(dept_no, d_name, loc) values('기획부', 10, '서울'); -- X

insert into exam01(dept_no, d_name, loc) values(10, '기획부', '서울'); -- O

insert into exam01(loc, dept_no, d_name) values('서울', 10, '기획부'); -- O

-- null 값을 허용하는 필드나, default 값이 있는 필드는 생략하고 입력할 수 있습니다.

insert into exam01(dept_no, d_name) values(10, '기획부'); -- O

​

-- #2. 모든 필드에 해당하는 값들을 최초에 테이블 생성 시에 기술한 필드 순서에 맞게 모두 입력하는 방법입니다.

insert into exam01 values(10, '기획부', '서울'); -- O

-- #2는 null 을 허용하는 곳을 비우고 입력할 수 없으며, null 이라도 직접 지정해야 합니다.

insert into exam01 values(10, null, '서울'); -- O

​

-- #1 과 #2 공통으로 숫자는 그냥 쓰고, 문자는 작은 따옴표로 묶어서 표현합니다.

​

delete from book_list; -- 테이블의 모든 레코드를 삭제하는 명령(where 절에 조건식을 적지 않으면 레코드 전체가 삭제된다.)

​

-- 위 두가지 방법 중 자유롭게 선택하여서 book_list 테이블에 10개의 레코드를 추가해주세요.

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, '가면산장 살인사건', 2018, 13320, 1500, '12');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, '나미야 백화점의 기적', 2017, 13320, 2000, '18');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, '유튜브 영상편집', 2020, 20700, 2500, 'all');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, '이것이 자바다', 2017, 30000, 3000, '18');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, 'JSP 웹프로그래밍', 2016, 25000, 2500, '12');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, '오라클데이터베이스', 2020, 30000, 3000, 'all');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, 'HTML/CSS', 2018, 20000, 3000, 'all');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, 'SpringBoot프로그래밍', 2020, 20000, 3500, 'all');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, '함께배우는C언어', 2018, 20000, 3000, 'all');

insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal, '함께배우는C++', 2021, 30000, 2000, 'all');

​

​

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '김동민', '010-1111-2222', '98/9/8', 300, 'M', 27);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '홍길동', '010-2222-3333', '90/1/2', 100, 'M', 35);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '홍길서', '010-3333-4444', '91/1/3', 200, 'F', 34);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '홍길남', '010-4444-5555', '92/2/2', 50, 'M', 33);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '추신수', '010-1122-3322', '95/5/5', 250, 'M', 30);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '류현진', '010-5555-6666', '96/6/6', 200, 'M', 29);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '손흥민', '010-7777-8888', '92/7/6', 400, 'M', 33);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '박지성', '010-8888-9999', '90/2/2', 250, 'M', 35);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '이영표', '010-0000-1111', '91/1/1', 300, 'M', 34);

insert into member_list(member_num, name, phone, birth, b_point, gender, age) values(member_seq.nextVal, '최진철', '010-0101-0101', '89/8/9', 350, 'M', 36);

​

UPDATE MEMBER_LIST SET name = 'DMK' WHERE name = '김동민';

​

select * from book_list;

select* from member_list;

select * from RENT_LIST;

​

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/01', 1, 1, 100);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/01', 2, 2, 100);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/02', 3, 3, 200);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/02', 4, 4, 100);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/03', 5, 5, 200);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/03', 6, 6, 300);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/04', 7, 7, 100);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/04', 8, 8, 300);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/05', 9, 9, 100);

insert into rent_list(num_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal,'2021/10/05', 10, 10, 200);

​

ALTER TABLE rent_list RENAME COLUMN NUM_SEQ TO RENT_SEQ;

​

commit -- 현재창에서 commit은 세미콜론을 붙이지 않습니다. 단일 명령이고 다른 명령과 함께 사용하지 못한다는 뜻입니다.

​

​

-- 데이터베이스 백업명령

exp userid = scott/tigher file=abc.dmp log=abc.log

​

-- 데이터베이스 복원명령

imp userid = scott/tigher file=abc.dmp log=abc.log full=y

​

-- 오라클 백업 명령과 복원 명령은 모두 command 창에서 실행합니다.