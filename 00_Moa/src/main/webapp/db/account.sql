create table account(
	account_name varchar2 (10 char) not null,
	account_byear number (4) not null,
	account_bmonth number (2) not null,
	account_bday number (2) not null,
	account_id varchar2 (10 char) primary key,
	account_pw varchar2 (20 char) not null,
	account_email varchar2 (30 char) not null,
	account_gender varchar2 (2 char) not null, 
	account_addr varchar2 (10 char) not null,
	account_phone varchar2 (20 char) not null
);

insert into account values(
'test',
2000,
12,
31,
'test',
'test1234',
'test@test.com',
'여',
'경기도',
'010-0000-0000'
);


select * from account;

create table account_test(

);
