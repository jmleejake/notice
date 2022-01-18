package com.rsupport.notice.vo;

/**
● 공지사항 등록시 입력 항목은 다음과 같다
- 제목, 내용, 공지 시작일시, 공지 종료일시, 첨부파일 (여러개)
● 공지사항 조회시 응답은 다음과 같다.
- 제목, 내용, 등록일시, 조회수, 작성자
 * */
public class NoticeVO {
	private String id; // ID
	private String title; // 제목
	private String cntnt; // 내용
	private String author; // 작성자
	private String reg_dt; // 등록일시
	private String read_cnt; // 조회수
	private String st_dt; // 공지시작일시
	private String ed_dt; // 공지종료일시
	private String attach_cnt; // 첨부파일개수
	private String dbsts; // 상태값
	
	private String attach_id; // 첨부파일ID
	private String original_nm; // 첨부파일명
	private String attach_reg_dt; // 첨부파일 등록일시
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCntnt() {
		return cntnt;
	}
	public void setCntnt(String cntnt) {
		this.cntnt = cntnt;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getRead_cnt() {
		return read_cnt;
	}
	public void setRead_cnt(String read_cnt) {
		this.read_cnt = read_cnt;
	}
	public String getSt_dt() {
		return st_dt;
	}
	public void setSt_dt(String st_dt) {
		this.st_dt = st_dt;
	}
	public String getEd_dt() {
		return ed_dt;
	}
	public void setEd_dt(String ed_dt) {
		this.ed_dt = ed_dt;
	}
	public String getAttach_cnt() {
		return attach_cnt;
	}
	public void setAttach_cnt(String attach_cnt) {
		this.attach_cnt = attach_cnt;
	}
	public String getDbsts() {
		return dbsts;
	}
	public void setDbsts(String dbsts) {
		this.dbsts = dbsts;
	}
	public String getAttach_id() {
		return attach_id;
	}
	public void setAttach_id(String attach_id) {
		this.attach_id = attach_id;
	}
	public String getOriginal_nm() {
		return original_nm;
	}
	public void setOriginal_nm(String original_nm) {
		this.original_nm = original_nm;
	}
	public String getAttach_reg_dt() {
		return attach_reg_dt;
	}
	public void setAttach_reg_dt(String attach_reg_dt) {
		this.attach_reg_dt = attach_reg_dt;
	}
}
