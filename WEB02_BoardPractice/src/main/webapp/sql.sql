drop table board;
drop table member;

CREATE TABLE board (
  `num` INT NOT NULL AUTO_INCREMENT,
  `pass` VARCHAR(45) NOT NULL,
  `userid` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `content` VARCHAR(1000) NOT NULL,
  `readcount` INT NULL DEFAULT 0,
  `writedate` DATETIME NULL DEFAULT now(),
  PRIMARY KEY (`num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

insert into board(pass, userid, email, title, content) values('1234', 'hong1', 'hong1@naver.com', '첫방문입니다.', '반갑습니다. 앞으로 많은 격려와 지도편달 부탁드립니다.');
insert into board(pass, userid, email, title, content) values('1234', 'hong2', 'hong2@naver.com', '돼지골마을', '돼지 삼겹살이 맛있습니다.');
insert into board(pass, userid, email, title, content) values('1234', 'hong3', 'hong3@naver.com', '게시판 개설.', '축하드립니다. 무궁한 발전을 기원할게요.');
insert into board(pass, userid, email, title, content) values('1234', 'hong4', 'hong4@naver.com', '2024년 겨울.', '몹시 추울꺼 같아요... 다들 건강에 유의하세요...');
insert into board(pass, userid, email, title, content) values('1234', 'hong5', 'hong5@naver.com', '맛집공유', '맛집공유 및 추천해주세요.');

CREATE TABLE member (
  `userid` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


insert into member values('hong1', '홍길동', '1234', 'hong1@gmail.com', '010-1234-1234');
insert into member values('hong2', '홍길서', '1234', 'hong2@gmail.com', '010-2222-1234');
insert into member values('hong3', '홍길남', '1234', 'hong3@gmail.com', '010-3333-1234');

select* from member;
select* from board;

CREATE TABLE `board`.`reply` (
  `replynum` INT NOT NULL AUTO_INCREMENT,
  `boardnum` INT NOT NULL,
  `userid` VARCHAR(45) NOT NULL,
  `writedate` DATETIME NOT NULL DEFAULT now(),
  `content` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`replynum`),
  INDEX `fk1_idx` (`boardnum` ASC) VISIBLE,
  INDEX `fk2_idx` (`userid` ASC) VISIBLE,
  CONSTRAINT `fk1`
    FOREIGN KEY (`boardnum`)
    REFERENCES `board`.`board` (`num`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk2`
    FOREIGN KEY (`userid`)
    REFERENCES `board`.`member` (`userid`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

insert into reply(boardnum, userid, content) values(4, 'hong2', '방갑습니다 수고하세요');
insert into reply(boardnum, userid, content) values(4, 'hong3', '또 뵐께요 안녕하가세요');

select* from reply;

insert into board(pass, userid, email, title, content) values('1234', 'hong1', 'hong1@naver.com', '첫방문입니다.', '반갑습니다. 앞으로 많은 격려와 지도편달 부탁드립니다.');
insert into board(pass, userid, email, title, content) values('1234', 'hong2', 'hong2@naver.com', '돼지골마을', '돼지 삼겹살이 맛있습니다.');
insert into board(pass, userid, email, title, content) values('1234', 'hong3', 'hong3@naver.com', '게시판 개설.', '축하드립니다. 무궁한 발전을 기원할게요.');
insert into board(pass, userid, email, title, content) values('1234', 'hong4', 'hong4@naver.com', '2024년 겨울.', '몹시 추울꺼 같아요... 다들 건강에 유의하세요...');
insert into board(pass, userid, email, title, content) values('1234', 'hong5', 'hong5@naver.com', '맛집공유', '맛집공유 및 추천해주세요.');
insert into board(pass, userid, email, title, content) values('1234', 'hong1', 'hong1@naver.com', '첫방문입니다.', '반갑습니다. 앞으로 많은 격려와 지도편달 부탁드립니다.');
insert into board(pass, userid, email, title, content) values('1234', 'hong2', 'hong2@naver.com', '돼지골마을', '돼지 삼겹살이 맛있습니다.');
insert into board(pass, userid, email, title, content) values('1234', 'hong3', 'hong3@naver.com', '게시판 개설.', '축하드립니다. 무궁한 발전을 기원할게요.');
insert into board(pass, userid, email, title, content) values('1234', 'hong4', 'hong4@naver.com', '2024년 겨울.', '몹시 추울꺼 같아요... 다들 건강에 유의하세요...');
insert into board(pass, userid, email, title, content) values('1234', 'hong5', 'hong5@naver.com', '맛집공유', '맛집공유 및 추천해주세요.');


select* from board order by num desc limit 10 offset 5;

alter table board add column image varchar(50);
alter table board add column savefilename varchar(50);

select* from board order by num desc;