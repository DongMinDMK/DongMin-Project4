CREATE TABLE `scott`.`member_list` (
  `member_num` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `birth` DATETIME NULL DEFAULT now(),
  `age` INT NULL DEFAULT 20,
  `b_point` INT NULL DEFAULT 0,
  PRIMARY KEY (`member_num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

select * from member_list;


-- book_list 테이블 생성
CREATE TABLE `scott`.`book_list` (
  `book_num` INT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(100) NOT NULL,
  `make_year` INT NULL,
  `in_price` INT NOT NULL,
  `rent_price` INT NOT NULL,
  `grade` VARCHAR(5) NULL DEFAULT 'all',
  PRIMARY KEY (`book_num`))
  ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


drop table book_list;
drop table member_list;
drop table rent_list;
-- 자주 쓰는 자료형 
-- INT : 정수 자료형(FLOAT, DOUBLE 은 실수)
-- VARCHAR : 문자열 자료형, 가변 길이(CHAR은 고정 길이)
-- TEXT : 긴 문자열은 TEXT로 별도 저장
-- DATETIME : 날짜 자료형 저장
-- TINYINT : -128 ~ 127까지 저장하지만 여기서는 1또는 0만 저장해 Boolean 값 표현

-- 자주쓰는 제약 조건
-- NOT NULL : 빈 값은 받지 않는다는 뜻(NULL 은 빈 값 허용)
-- AUTO_INCREMENT : 숫자 자료형인 경우 다음 로우가 저장 될 때 자동으로 1 증가
-- UNSIGNED : 0과 양수만 허용
-- ZEROFILL : 숫자와 자리 수가 고정된 경우 빈 자리에 0을 넣음.
-- DEFAULT now() : 날짜 컬럼의 기본값을 현재 시간으로. DATETIME 자료형에 적용가능

-- rent_list 테이블 생성 
CREATE TABLE `scott`.`rent_list` (
  `rent_num` INT NOT NULL AUTO_INCREMENT,
  `rent_date` DATETIME NULL DEFAULT now(),
  `b_num` INT NOT NULL,
  `m_num` INT NOT NULL,
  `discount` INT NULL DEFAULT 0,
  PRIMARY KEY (`rent_num`),
  INDEX `fk1_idx` (`b_num` ASC) VISIBLE,
  INDEX `fk2_idx` (`m_num` ASC) VISIBLE,
  CONSTRAINT `fk1`
    FOREIGN KEY (`b_num`)
    REFERENCES `scott`.`book_list` (`book_num`) ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk2`
    FOREIGN KEY (`m_num`)
    REFERENCES `scott`.`member_list` (`member_num`) ON DELETE CASCADE
   	ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

select* from rent_list;

-- 필드의 수정
alter table member_list change column `birth` `birthday` date not null;

-- 필드의 삭제
alter table member_list drop column `gender`;

-- 필드의 추가
alter table member_list add column gender varchar(3) null after age;

select * from member_list;

-- 테이블의 삭제
drop table rent_list;

create or replace view rentDetail as
select a.rent_num, date_format(a.rent_date,'%Y-%m-%d') as rent_date, a.b_num, b.subject, a.m_num, c.name, a.discount
from rent_list a, book_list b, member_list c
where a.b_num = b.book_num and a.m_num = c.member_num;

select * from rentDetail;


