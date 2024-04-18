CREATE TABLE `scott`.`person_list` (
  `person_num` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `gender` VARCHAR(10) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`person_num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

insert into person_list(name, age, gender, email, address) values ("김동민", 27, "남성", "syh6917@naver.com", "서울시 노원구");
insert into person_list(name, age, gender, email, address) values ("홍길동", 35, "남성", "hong@gmail.com", "서울시 송파구");
insert into person_list(name, age, gender, email, address) values ("홍길순", 20, "여성", "honggiisoon@naver.com", "서울시 관악구");

select * from person_list;