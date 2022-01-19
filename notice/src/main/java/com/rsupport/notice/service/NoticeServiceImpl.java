package com.rsupport.notice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import com.rsupport.notice.mapper.INoticeMapper;
import com.rsupport.notice.util.FileUtils;
import com.rsupport.notice.vo.AttachVO;
import com.rsupport.notice.vo.NoticeVO;

@Service
public class NoticeServiceImpl implements INoticeService {
	@Autowired
	private INoticeMapper mapper;
	
	@Autowired
	private FileUtils util;

	@Override
	public ArrayList<NoticeVO> getNoticeList() {
		return mapper.getNoticeList();
	}

	@Override
	public ArrayList<NoticeVO> manipulateNotice(NoticeVO vo, MultipartFile[] files) {
		if(null != vo.getId() && !"".equals(vo.getId())) {
			mapper.updateNotice(vo);
		}else {
			mapper.insertNotice(vo);
		}
		
		List<AttachVO> fileList = util.uploadFiles(files, vo.getId());
		if(CollectionUtils.isEmpty(fileList) == false) {
			for(AttachVO attachVO : fileList) {
				mapper.insertAttach(attachVO);
			}
		}
		return mapper.getNoticeList();
	}

	@Override
	public ArrayList<NoticeVO> getNoticeDetail(String id) {
		ArrayList<NoticeVO> srch = mapper.getNoticeDetail(id);
		// 조회수 update
		NoticeVO vo = new NoticeVO();
		vo.setId(srch.get(0).getId());
		vo.setRead_cnt(String.valueOf(Integer.parseInt(srch.get(0).getRead_cnt())+1));
		mapper.updateNotice(vo);
		return mapper.getNoticeDetail(srch.get(0).getId());
	}

}
