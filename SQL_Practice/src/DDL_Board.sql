CREATE TABLE `dmk_schema`.`board` (
  `boardnum` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `content` VARCHAR(45) NOT NULL,
  `writedate` DATETIME NOT NULL DEFAULT now(),
  `readcount` INT NULL DEFAULT 1,
  PRIMARY KEY (`boardnum`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;



insert into board(title, content) values('프리미어리그 일정', '프리미어리그 일정입니다.');
insert into board(title, content) values('분데스리가 일정', '분데스리가 일정입니다.');
insert into board(title, content) values('리그앙 일정', '리그앙 일정입니다.');


select* from board;