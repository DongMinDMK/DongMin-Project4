CREATE TABLE `dmk_schema`.`baseball` (
  `baseid` INT NOT NULL AUTO_INCREMENT,
  `baseballteam` VARCHAR(45) NOT NULL,
  `rank` VARCHAR(20) NOT NULL,
  `teamcolor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`baseid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


insert into baseball(baseballteam, `rank`, teamcolor) values('삼성 라이온즈', '4위', '파란색');
insert into baseball(baseballteam, `rank`, teamcolor) values('기아 타이거즈', '1위', '빨강색');
insert into baseball(baseballteam, `rank`, teamcolor) values('LG 트윈스', '2위', '검정/흰색');

select* from baseball;