drop table tb_notice;
create table tb_notice (
	id int unsigned primary key auto_increment comment 'ID'
	, title varchar(1000) comment '제목'
	, cntnt varchar(2000) comment '내용'
	, author varchar(200) comment '작성자'
	, read_cnt int default 0 comment '조회수'
	, reg_dt datetime default now() comment '등록일시'
	, upd_dt datetime comment '수정일시'
	, st_dt datetime comment '공지시작일시'
	, ed_dt datetime comment '공지종료일시'
	, dbsts char(1) default 'A' comment '상태값'
) default charset = utf8 comment '공지사항';

drop table tb_attach;
create table tb_attach (
	id int unsigned primary key auto_increment comment 'ID'
	, notice_id int comment '공지사항ID'
	, original_nm varchar(300) comment '파일명'
	, save_nm varchar(100) comment '저장파일명'
	, size varchar(100) comment '파일크기'
	, reg_dt datetime default now() comment '등록일시'
	, upd_dt datetime comment '수정일시'
	, dbsts char(1) default 'A' comment '상태값'
) default charset = utf8 comment '첨부파일';