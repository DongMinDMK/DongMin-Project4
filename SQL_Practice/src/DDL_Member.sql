CREATE TABLE `dmk_schema`.`member` (
  `userid` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `gender` CHAR(1) NOT NULL DEFAULT 'M',
  `email` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


insert into member(userid, pwd, name, email) values('kdm1234', '1234', 'dmk', 'dmk@naver.com');

select* from member;