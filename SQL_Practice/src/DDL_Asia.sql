CREATE TABLE `dmk_schema`.`asia` (
  `countryid` INT NOT NULL AUTO_INCREMENT,
  `countryname` VARCHAR(45) NOT NULL,
  `averagepeople` VARCHAR(45) NOT NULL,
  `capacity` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`countryid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


insert into asia(countryname, averagepeople, capacity) values('대한민국', '5천만', '서울');
insert into asia(countryname, averagepeople, capacity) values('일본', '1억 2천만', '도쿄');
insert into asia(countryname, averagepeople, capacity) values('중국', '13억', '베이징');

select* from asia;