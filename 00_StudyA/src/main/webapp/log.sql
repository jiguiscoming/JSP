create table log(
	log_no number(3) primary key,
	name varchar2(20 char),
	age varchar2 (3 char),
	id varchar2 (20 char),
	pw varchar2 (20 char)
);

create sequence log_seq;

drop table log cascade constraint purge;

select * from log;

