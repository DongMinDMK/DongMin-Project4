drop table member;
drop table notice;
drop table customerinquiry;

CREATE TABLE `twoving`.`member` (
  `userid` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `indate` DATETIME NOT NULL DEFAULT now(),
  `useyn` CHAR(1) NOT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


CREATE TABLE `twoving`.`notice` (
  `noticeid` INT NOT NULL AUTO_INCREMENT,
  `userid` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `content` VARCHAR(1000) NOT NULL,
  `indate` DATETIME NOT NULL DEFAULT now(),
  `readcount` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`noticeid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


CREATE TABLE `customerinquiry` (
	`ciseq`	int	NOT NULL,
	`name`	VARCHAR(45)	NOT NULL,
	`phone`	VARCHAR(45)	NOT NULL,
	`Inquirylist`	VARCHAR(100)	NOT NULL,
	`devicephone`	VARCHAR(100) NULL,
	`devicemodelname`VARCHAR(100) NULL,
	`comenvironment` VARCHAR(45) NULL,
	`runplace` VARCHAR(45) NULL,
	`runtime1`	VARCHAR(50)	NULL,
	`runtime2`	VARCHAR(50)	NULL,
	`runcontent`	VARCHAR(50)	NULL,
	`inquirytitle`	VARCHAR(50)	NOT NULL,
	`inquirycontent`	VARCHAR(1000) NOT NULL
);

ALTER TABLE `customerinquiry` ADD CONSTRAINT `PK_CUSTOMERINQUIRY` PRIMARY KEY (
	`ciseq`
);

insert into notice(userid, title, content) values('hong1', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong2', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong3', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong4', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong5', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong6', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong7', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong8', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong9', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong10', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong11', '제목입니다.', '내용입니다');


select* from member;
select* from notice;

select* from customerinquiry;

insert into customerinquiry(name, email, phone, inquiryList, devicephone, devicemodelname, runtime1, runtime2, runcontent, inquirytitle, inquirycontent)  values('hong1', 'syh6917@naver.com', '010-1111-1111', '회원/로그인', 'PC', '윈도우11', '03:00', '07:00', '드라마', '안녕하세요', '드라마 관련 질문드립니다.');



-- 신상품 View 생성

create or replace view new_pro_view as

select pseq, name, price2, image from product where useyn='Y' order by indate desc limit 4;

​

select* from new_pro_view;

​

-- 베스트 상품 view 생성

create or replace view best_pro_view as

select pseq, name, price2, image from product where bestyn='Y' order by indate desc limit 4;
