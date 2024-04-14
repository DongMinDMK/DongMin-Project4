-- 데이터 변경 - 수정(Update)

-- UPDATE 테이블명 SET 변경내용 WHERE 검색조건

UPDATE member_list SET age = 30, phone = '010-0000-1111' WHERE member_num = 3;

​

select * from member_list;

select * from BOOK_LIST;

select* from RENT_LIST;

​

-- 명령문에 WHERE 이후 구문은 생략이 가능합니다.

-- 다만 이부분을 생략하면 모든 레코드를 대상으로 해서 UPDATE 명령이 실행되어 모든 레코드가 수정됩니다.

-- 검색조건 : 필드명(비교-관계연산자) 조건값 으로 이루어진 조건연산이며, 흔히 자바에서 if()

-- if 괄호안에 사용했던 연산을 그대로 사용하는게 보통입니다.

-- 나이가 29세 이상 -> WHERE AGE >= 29

-- 두 개 이상의 필드를 수정하고자 한다면 (,) 로 구분해서 기술합니다.

-- 복합 조건을 사용하고자 한다면 and, or 등을 사용합니다. (&& -> and, || -> or, ! -> Not)

​

-- book_list 테이블의 도서 제목 '가면산장 살인사건' 도서의 grade 를 '18' 로 수정하세요.

UPDATE book_list SET grade = 18 WHERE subject = '가면산장 살인사건';

-- UPDATE book_list SET grade = 18 WHERE subject = '%가면산장';

-- UPDATE book_list SET grade = 18 WHERE subject = '가면산장%';

-- UPDATE book_list SET grade = 18 WHERE subject = '%인형%';

​

-- book_list 의 모든 도서의 대여가격(rent_price) 를 10% 이상으로 인상한 값으로 수정하세요.

UPDATE book_list SET rent_price = rent_price + rent_price * 0.1;

​

-- member_list 에서 사은포인트(b_point) 가 300 이상인 회원의 b_point 에 30점을 가산해주세요.

UPDATE MEMBER_LIST SET b_point = b_point + 30  WHERE b_point >= 300;

​

-- 생년월일이 '1998-09-08' 인 회원이 생년월일을 2000-01-01 로 AGE를 23으로 변경하세요.

UPDATE MEMBER_LIST SET birth = '2020-01-01', age = 23 WHERE birth = '1998-09-08';

​

-- GENDER 가 'F' 인 회원의 GENDER 를 'M' 으로 변경하세요.

UPDATE MEMBER_LIST SET GENDER = 'M' WHERE GENDER = 'F';

​

select * from member_list;

select * from BOOK_LIST;

select* from RENT_LIST;

​

-- 외래키로 참조되는 필드를 수정

UPDATE BOOK_LIST SET book_num = 17 WHERE book_num = 7;

​

-- rent_list 에 b_num에 7번이 없다면 변경이 가능

​

-- rent_list 에 b_num 에 7번이 있다면 변경이 불가능

-- 해결방법 #1. 외래키를 지우고 해당 book_num과 b_num 을 함께 수정한 후 다시 외래키를 설정

-- 해결방법 #2. PL/SQL 의 트리거 기능을 이용해서 동시에 변경

​

-- 레코드의 삭제

-- DELETE FROM 테이블명 WHERE 조건식

-- WHERE 조건식이 생략되면 모든 레코드가 삭제된다.

​

-- RENT_LIST 테이블에서 discount 가 10이하인 레코드 삭제

DELETE FROM RENT_LIST WHERE discount <= 100;

​

-- 삭제 제한

delete from BOOK_LIST where book_num = 7; -- 삭제 실패

-- intergrity constraint(SCOTT.FK1) violated - child record found 에러 발생

​

-- 해결방법 #1

-- 이를 해결하려면 우선 rent_list 테이블에 해당 도서 대여목록 레코드(child record) 를 모두 삭제한 후

-- book_list 테이블에서 해당 도서를 삭제

delete from rent_list where b_num = 7;

delete from book_list where book_num = 7;

​

-- 해결방법 #2

-- 외래키 제약조건을 삭제한 후 다시 생성

-- 외래키 생성시에 "옵션을 추가해서"

-- "참조되는 값(parents recored) 이 삭제되면 참조되는 값(child recored)도 같이 삭제" 되게 구성합니다.

​

-- 외래키 삭제

alter table rent_list drop constraint fk1;

​

-- 새로운 외래키 추가

alter table rent_list add constraint fk1 FOREIGN KEY(b_num) references book_list(book_num) ON DELETE CASCADE;

​

​

-- 하면 정상적으로 삭제 완료

delete from BOOK_LIST where book_num = 7;

​

-- member_list 테이블에서 회원 한명을 삭제하면, rent_list 테이블에서도 해당 회원이 대여한 기록을 같이 삭제하도록 외래키 설정을 바꿔주세요.(외래키 제약조건 삭제 후 재생성)

-- 외래키 삭제

alter table rent_list drop constraint fk2;

​

-- 새로운 외래키 추가 

alter table rent_list add constraint fk2 foreign key(m_num) references member_list(member_num) on DELETE CASCADE;

​

select * from member_list;

select * from BOOK_LIST;

select* from RENT_LIST;