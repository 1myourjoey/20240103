create table member (
    id   varchar(20)  primary key,
    pw   varchar(20), 
    name varchar(20)
);

insert into member values ('admin', '1234', '관리자');
insert into member values ('hong1', 'abcd', '홍길동');

create table member (
	memberno int auto_increment primary key,
    id   varchar(20) unique,
    pw   varchar(20) not null, 
    name varchar(20) not null
);

insert into member(id, pw, name) values ('admin', '1234', '관리자');
insert into member(id, pw, name) values ('hong1', 'abcd', '홍길동');