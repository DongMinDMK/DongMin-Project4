CREATE TABLE `dmk_schema`.`student` (
  `studentid` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `gender` CHAR(1) NOT NULL DEFAULT 'M',
  `address` VARCHAR(100) NOT NULL,
  `hobby` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`studentid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


insert into student(name, gender, address, hobby) values('홍길순', 'W', '서울시 금천구', '야구');
insert into student(name, gender, address, hobby) values('홍길남', 'M', '서울시 강서구', '배구');
insert into student(name, gender, address, hobby) values('DMK', 'M', '서울시 노원구', '축구');

UPDATE student set hobby='영화보기' where name='DMK';

select* from student;