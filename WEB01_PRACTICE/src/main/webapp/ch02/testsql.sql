create table members(
	ID varchar(10),
	pwd varchar(20),
	name varchar(15),
	phone varchar(15)
);

insert into members values('SOMI', '1234', '이소미', '010-1234-1234');
insert into members values('SANG', '1234', '전상오', '010-5555-6666');
insert into members values('LIGHT', '1234', '김빛나', '010-2222-3333');

select* from members;

commit