-- 10_View.sql

-- * 오라클 - 뷰(View)
-- 물리적인 테이블에 근거한 논리적인 "가상 테이블" -> 저장되어 있는 select 문
-- 가상이란 단어는 실질적으로 데이터를 저장하고 있지 않기 때문에 붙인 것이고,
-- 테이블이란 단어는 실질적으로 데이터를 저장하고 있지 않더라도 사용자는 마치
-- 테이블을 사용하는 것과 동일하게 뷰를 사용할 수 있기 때문에 붙인 것.

-- 뷰는 기본테이블에서 파생된 객체로서 기본테이블에 대한 하나의 쿼리문임
-- 실제 테이블에 저장된 데이터를 뷰를 통해서 볼 수 있도록 함.

-- 뷰 생성 방법
create or replace view 뷰이름 as select 조회명령(select~);

create or replace view empinfo as
select a.empno, a.ename, a.deptno, b.dname, b.loc
from emp a, dept b
where a.deptno = b.deptno;

select * from empinfo;

select * from member_list;
select * from BOOK_LIST;
select* from RENT_LIST;


-- rent_list, member_list, book_list 가 조인된 결과는 report 라는 이름의 뷰를 생성하세요
-- 대여일자, 대여도서번호, 제목, 대여회원번호, 이름, 매출액(rent_price - discount)

create or replace view report as
select a.rentdate as 대여일자, a.b_num as 대여도서번호, c.subject as 제목, a.m_num as 대여회원번호, b.name as 이름, c.rent_price - a.discount as "매출액"
from rent_list a, member_list b, book_list c
where a.b_num = c.book_num and a.m_num = b.member_num;

select * from report;