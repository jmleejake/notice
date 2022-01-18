package com.rsupport.notice.service;

import java.util.ArrayList;

import com.rsupport.notice.vo.NoticeVO;

public interface INoticeService {
	// 공지사항 목록
	ArrayList<NoticeVO> getNoticeList();
	// 공지사항 등록, 수정
	ArrayList<NoticeVO> manipulateNotice(NoticeVO vo);
	// 공지사항 상세
	ArrayList<NoticeVO> getNoticeDetail(String id);
}
