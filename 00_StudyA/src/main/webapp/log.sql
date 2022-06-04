create table log(
	name varchar2(20 char) not null,
	age varchar2 (3 char) not null,
	id varchar2 (20 char) primary key,
	pw varchar2 (20 char) not null
);

create sequence log_seq;

drop table log cascade constraint purge;

select * from log;

