package com.rsupport.notice.mapper;

import java.util.ArrayList;

import com.rsupport.notice.vo.NoticeVO;

public interface INoticeMapper {
	// 공지사항 목록
	ArrayList<NoticeVO> getNoticeList();
	// 공지사항 등록
	int insertNotice(NoticeVO vo);
	// 공지사항 수정, 삭제
	int updateNotice(NoticeVO vo);
	// 공지사항 상세
	ArrayList<NoticeVO> getNoticeDetail(String id);
}
