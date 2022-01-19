package com.rsupport.notice.vo;

public class AttachVO {
	private String id; // ID
	private String notice_id; // 공자사항ID
	private String original_nm; // 파일명
	private String save_nm; // 저장파일명
	private String size; // 파일크기
	private String reg_dt; // 등록일시
	private String dbsts; // 상태값
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(String notice_id) {
		this.notice_id = notice_id;
	}
	public String getOriginal_nm() {
		return original_nm;
	}
	public void setOriginal_nm(String original_nm) {
		this.original_nm = original_nm;
	}
	public String getSave_nm() {
		return save_nm;
	}
	public void setSave_nm(String save_nm) {
		this.save_nm = save_nm;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getDbsts() {
		return dbsts;
	}
	public void setDbsts(String dbsts) {
		this.dbsts = dbsts;
	}

}
