create table tbl_testpage(
test_no number(38) primary key,
test_id varchar2(50) not null,
test_title varchar2(200) not null,
test_cont varchar2(4000) not null,
test_pass varchar2(80) not null,
test_name varchar2(50) not null,
test_phone varchar2(30) not null,
test_email varchar2(100) not null,
test_date date default sysdate
);

select * from tbl_testpage;

create sequence test_seq
start with 1
increment by 1
nocache
nocycle;

select test_seq.nextval as "test_seq다음시퀀스번호" from dual;

insert into tbl_testpage (test_no,test_id,test_pass,test_name,test_phone,test_email,test_title,test_cont) values(test_seq.nextval,'kjc1','1234',
																							'이순신','010-4444-4444','lee@gmail.com','어렵다 진짜','하기싫은데 어떡하냐 진짜로');
insert into tbl_testpage (test_no,test_id,test_pass,test_name,test_phone,test_email,test_title,test_cont) values(test_seq.nextval,'kjc2','5678',
																							'을지문덕','010-5555-5555','jimun@gmail.com','그냥 어렵다','그르게 완전 어렵다');
insert into tbl_testpage (test_no,test_id,test_pass,test_name,test_phone,test_email,test_title,test_cont) values(test_seq.nextval,'kjc3','1111',
																							'강감찬','010-6666-6666','gamchan2@gmail.com','그냥 고트 이순신','이순신 배 많이 남음?? 어케 함?');
insert into tbl_testpage (test_no,test_id,test_pass,test_name,test_phone,test_email,test_title,test_cont) values(test_seq.nextval,'kjc3','1111',
																							'홍길동','010-9999-9999','hong@gmail.com','우리섬 방어전 필요함','순시니형 도와줄 수 있음?? 우리 고립이임ㅜㅜ');
update tbl_testpage
update tbl_testpage
set test_id = 'kjc2',
	test_pass = '5678'
where test_phone = '010-5555-5555';

drop table tbl_testpage;