-- 04_LIMITOFFSET.sql

-- select 명령의 결과 레코드가 갯수가 많을 때, 일부만 지목해서 열람할 수 있습니다.
-- 오라클에서는 rownum 이라는 키워드를 이용합니다.

--   select rownum, 테이블이름.* from 테이블이름;
--  (select * from 테이블이름 where rownum >= 1 AND rownom <= 10);

SELECT * FROM member_list;
select * from book_list;

-- MySQL
-- LIMIT
-- select 로 데이터가 조회 할 때 조회할 레코드의 갯수를 조절 제한 할 수 있습니다.
select * from member_list order by member_num desc limit 5;
-- 회원 정보 조회하여 5개의 레코드만 리턴

-- OFFSET
-- select 로 데이터 조회할 때, 맨 위에서부터 offset 에 지정한 번째까지는 뛰어넘고 그 다음부터 리턴
select * from member_list order by member_num desc;
select * from member_list order by member_num desc limit 5 offset 3;
-- 3번째 데이터부터 5개의 레코드 리턴 - 개수가 모자라면 있는 곳까지 리턴(offset 은 최초값이 0부터이다. 즉 전체를 실행하려면 offset 0으로 시작하면 됨.)
