select * from emp;
select * from dept;
drop table emp2;
create table emp2 as select ename, deptno from emp where job = 'SALESMAN';

select * from emp2;

-- [1] 사원명이 'SCOTT' 인 사원의 부서명을 알고 싶을 때
select deptno from emp where ename = 'SCOTT'; -- 20
select dname from dept where deptno = 20; -- RESEARCH

-- 서브쿼리 사용
select dname from dept where deptno = (select deptno from emp where ename = 'SCOTT');

-- JOIN
-- 두 개이상의 테이블에 나눠져 있는 관련 데이터들을 하나의 테이블로 모아서 조회하고자 할 때 사용하는 명령입니다.

-- cross join : 두 개 이상의 테이블이 조인
-- 가장 최악의 결과를 얻은 조인 방식
select * from emp2, dept;

-- equi join : 조인 대상이 되는 두 테이블에서 공통적으로 존재하는 컬럼의 값이 일치하는 행을 연결하여 결과를 생성
select * from emp2, dept where emp2.deptno = dept.deptno;

select * from emp2 e, dept d where e.deptno = d.deptno;

select * from emp e, dept d where e.deptno = d.deptno;


select * from member_list;
select * from BOOK_LIST;
select* from RENT_LIST;

-- rent_list 의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되, 도서의 제목을 도서번호 옆에 출력하세요.
select a.rentdate, a.b_num, b.subject, a.m_num, a.discount from rent_list a, book_list b where a.b_num = b.book_num;

-- rent_list의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되, 회원의 이름을 대여회원번호 옆에 출력하세요.
select a.rentdate, a.b_num, a.m_num, b.name, a.discount from rent_list a, member_list b where a.m_num = b.member_num;

-- rent_list 의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되, 도서의 제목, 회원의 이름을 대여도서번호와 대여회원번호 옆에 출력하세요.
select a.rentdate, a.b_num, b.subject, a.m_num, c.name, a.discount, b.rent_price - a.discount as "매출액"
from rent_list a, book_list b, member_list c
where a.b_num = b.book_num and a.m_num = c.member_num;

-- non-equi-join
-- 동일 컬럼이 없어서 다른 조건을 사용하여 조인
-- 조인 조건에 특정 범위 내에 있는지를 조사하기 위해 조건절에 조인 조건을 '=' 연산자 이외의 비교
select * from emp;
select * from salgrade;

select a.ename, a.sal, b.grade
from emp a, salgrade b
where a.sal >= b.losal and a.sal <= b.hisal;

select a.ename, a.sal, b.grade
from emp a, salgrade b
where a.sal between b.losal and b.hisal;

-- outer join
-- 조인 조건에 만족하지 못해서 해당 결과를 출력사에 누락이 되는 문제점이 발생할 때 해당 레코드를 출력하는 조인
select a.book_num, a.subject, b.rentdate
from book_list a, rent_list b
where a.book_num = b.b_num(+);


-- emp 테이블에는 deptno 가 40인 레코드가 하나도 없다.
-- 그래서 조인된 결과에는 40번 부서의 이름도 LOC도 표시가 안됩니다.
select *
from emp a, dept b
where a.deptno(+) = b.deptno;


-- ANSI join

-- 일반 equi 조인
select a.ename, b.dname
from emp a, dept b
where a.deptno = b.deptno;

-- Ansi inner join
select ename, dname
from emp inner join dept on emp.deptno = dept.deptno;

-- Ansi inner join - 서로 비교되는 필드명이 같을때만 사용
select ename, dname
from emp inner join dept using(deptno);

-- Ansi Outer Join
select * from emp, dept
where emp.deptno(+) = dept.deptno;

select * from rent_list, book_list
where rent_list.b_num(+) = book_list.book_num;

-- Ansi Outer Join 표현방식
select * from emp right outer join dept on emp.deptno = dept.deptno;
select * from rent_list right outer join book_list on rent_list.b_num = book_list.book_num;
