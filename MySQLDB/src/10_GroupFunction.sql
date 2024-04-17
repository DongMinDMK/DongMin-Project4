-- 12_GroupFunction.sql

-- 테이블내의 하나의 필드값을 전체로 하는 함수

select * from book_list;

-- 합계(SUM)
select sum(in_price) as "입고가격합계" from book_list;

select sum(rent_price) as "대여가격합계" from book_list where in_price >= 18000;


select * from MEMBER_LIST;

-- 개수(COUNT)
select count(*) as "회원수" from member_list;
select count(*) as "회원수" from member_list where b_point >= 100;

-- 평균(AVG)
select avg(in_price) as "입고가격평균" from book_list;
select round(avg(in_price),0) as "입고가격평균" from book_list; -- 나중에 이것으로 계산을 한다? 그러면 숫자로 남아야 하니 계속 이것으로 해야함
-- to_char 로 변경된 숫자는 문자로 변경된 것이므로 이제 숫자로서의 기능이 상실된다. 다른 숫자와 계산 불가
select to_char(avg(in_price),'999,999,999') as "입고가격평균" from book_list; -- 아니다 출력만하고 결과만 볼거다 그러면 콤마를 찍힌 이 함수를 추천
-- MAX : 최대값
-- sequence 에 의해서 방금 추가된 자동 증가번호를 조회할 때 많이 사용합니다.
select max(in_price) as "최대값" from book_list;

-- MIN : 최소값
select min(in_price) as "최소값" from book_list;

select * from rent_list;

insert into RENT_LIST(rent_seq, rentdate, b_num, m_num, discount) values(rent_seq.nextVal, '2021-01-01', 1, 1, 300);

-- GROUP BY
-- 그룹함수의 결과들을 다른 필드의 그룹으로 재구성
select count(*) as "총 대여건수" from rent_list;

-- 도서별 대여건수
select b_num as "도서번호", count(*) as "도서별 대여건수", sum(discount) as "도서별 할인금액합계" from rent_list group by b_num;

-- rent_list 테이블에서 대여일자(rentdate)별 대여견수와 할인금액 평균
select rentdate as 대여일자, count(*) as 대여건수
from rent_list group by rentdate order by rentdate desc;

-- 	HAVING
-- 그룹핑된 내용들에 조건을 붙일 때
select rentdate as 대여일자, count(*) as 대여건수, avg(discount) as 할인금액평균
from RENT_LIST
group by rentdate
having avg(discount) >= 150
order by rentdate desc;