-- 08_DML_Select.sql

​

-- 오라클 명령어 : select 문(검색)

-- 가장 사용빈도수가 높은 명령

​

-- [1]. scott 사용자가 관리하고 있는 테이블 목록

select * from tab;

select * from tabs;

​

-- [2]. 특정 테이블의 구조 조회(필드 테스트 / 데이터 형식)

desc book_list; -- 커맨드창(sqlplus) 에서 확인요망

desc member_list; -- 커맨드창(sqlplus) 에서 확인요망

​

select * from user_constraints; -- 모든 제약사항

select * from user_constraints where table_name = 'RENT_LIST'; -- 특정 테이블 제약사항, 여기선 조건문으로 테이블명을 적을 때 무조건 대문자로 작성해야한다.

select * from user_constraints where table_name = 'BOOK_LIST'; 

select * from user_constraints where table_name = 'MEMBER_LIST'; 

​

-- SELECT 의  사용법

-- SELECT : SELECT 와 FROM 사이에 조회하고자 하는 필드명들을 , 로 구분하여 나열합니다.

SELECT book_num, subject, rent_price from book_list;

-- 모든 필드는 한번에 지목하려면 * 을  써줍니다. -- select * from ...

-- from 뒤에는 대상 테이블 명을 써줍니다.

-- where 절을 붙여서 조건에 맞는 행만 골라내기도 합니다.

select 필드명들 또는 * from 테이블명 where 검색조건

​

-- 출판연도가 2020년 이후인 도서의 제목과 출판년도를 조회

select subject, make_year from book_list where make_year >= 2020 ORDER BY make_year desc;

​

select * from book_list -- 아무 검색 조건 없이 모든 필드를 다 조회해서 열람

​

-- 연산의 결과가 필드의 항목을 조회될 수 있습니다.

select rent_price * 10 - in_price from book_list;

select rent_price * 10 - in_price as 마진 from book_list;

select subject as 제목 , rent_price * 10 - in_price as 마진 from book_list;

select subject as "제목" , rent_price * 10 - in_price as "10회대여 마진" from book_list;

select book_num || '-' || subject as "book info" from book_list;

-- 오라클 SL 에서 || 는 이어붙이기 연산입니다.

​

​

​

-- 중복제거 DISTINCT 

select b_num as "대여도서번호들" from rent_list;

select DISTINCT b_num as "대여도서번호들" from rent_list;

​

-- 함수의 사용

select avg(in_price) as 입고가격평균 from book_list;

​

-- 검색 조건 : update 와 delete 에서 사용하던 where 와 사용방식이 똑같습니다.

​

select * from member_list;

select * from BOOK_LIST;

select* from RENT_LIST;

​

-- member_list 테이블에서 이름이 '홍' 으로 시작하는 회원의 모든 회원정보 출력

select * from member_list where name like '홍%';

​

-- member_list 테이블에서 1983년도 이후로 태어난 회원의 모든 회원정보 출력

select * from member_list where birth >= '1983-01-01'; 

​

-- book_list 에서 제작년도가 2016년 이전이거나 입고가격(in_price) 이 18000원 이하인 도서의 모든 필드

select * from book_list where make_year < 2016 or in_price <= 18000;

​

-- book_list 에서 도서 제목에 두번째 글자가 '것' 인 도서의 정보

select* from book_list where  subject like '_것%';



​INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');

INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);

-- IN, ANY, SOME, ALL
-- 부서번호가 10, 20, 30 인 사원들의 모든 필드 조회
-- 방법 #1
SELECT * FROM EMP WHERE deptno = 10 or deptno = 20 or deptno = 30;
-- 방법 #2
select * from emp where deptno <> 40;
-- 방법 #3
select * from emp where deptno in(10,20,30);

-- 1. ANY
select * from emp where deptno = any(10,20,40);
-- ANY() : 괄호 안에 나열된 내용 중 어느하나라도 해당하는 것이 있다면 검색 대상으로 함.
-- in 과 유사 다만 차이점은 ANY 는 = 을 이용한다.

-- 2. SOME 조건식 - ANY 와 동일
select * from emp where deptno = some(10,20,40);

-- 3. ALL
select * from emp where deptno = all(10, 20, 40);
-- 괄호안의 모든 값이 동시 만족해야 하는 조건으므로 해당하는 레코드가 없을 때가 대부분입니다. 사용빈도수가 현저히 적습니다.

select * from emp where deptno <> all(10,20,40);
-- 이와 같이 구성내용과 모두 같지 않을 때를 필터링할 때 자주 사용합니다.
-- 바로 위 예문을 in 으로 표현
select * from emp where deptno NOT IN(10,20,40);


-- 그 외 활용하기 좋은 select 에 대한 예제

-- 부서번호가 10이 아닌 사원(아래 두 문장은 같은 의미의 명령입니다.)
select * from emp where NOT (deptno = 10);
select * from emp where deptno <> 10;

-- 급여가 1000달러 이상, 3000달러 이하
select * from emp where SAL >= 1000 and SAL <= 3000;
select * from emp where SAL between 1000 and 3000;

-- 사원의 연봉 출력
select deptno, ename, sal*12 as 연봉 from emp;

-- 정렬(sort) - where 구문 뒤에 또는 구문의 맨 끝에 order by 필드명[desc]
-- select 명령의 결과를 특정 필드값의 오름차순 이나 내림차순으로 정렬하라는 명령
-- asc : 오름차순 정렬, 쓰지 않으면 기본 오름차순 정렬로 실행됩니다.
-- desc : 내림차순 정렬, 내림차순 정렬을 위해서는 반드시 정렬 기준이 되는 필드명 써야 하는 키워드입니다.

-- emp 테이블에서
-- SAL 이 1000 이상인 데이터를 ename 의 오름차순으로 정렬하여 조회
select * from emp where sal >= 1000 order by ename asc;
-- SAL이 1000 이상인 데이터를 ename 의 내림차순으로 정렬하여 조회
select* from emp where sal >= 1000 order by ename desc;

-- job 으로 내림차순으로 정렬 후 같은 job_id 사이에서는 순서를 hiredate 의 내림차순으로 정렬
select * from emp order by job desc, hiredate desc;
-- 두 개 이상의 정렬 기준이 필요하다면 위와 같이 컴마(,) 로 구분해서 두 가지 기준을 지정해주며,
-- 위의 예제로 봤을 때 job 으로 1차 내림차순 정렬하고, 같은 job 값들 사이에 hiredate 로 내림차순 정렬합니다.