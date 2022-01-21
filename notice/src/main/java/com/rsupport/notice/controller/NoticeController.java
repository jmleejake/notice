package com.rsupport.notice.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rsupport.notice.service.INoticeService;
import com.rsupport.notice.vo.NoticeVO;

@RequestMapping(value = "/notice")
@RestController
public class NoticeController {
	
	@Autowired
	private INoticeService service;
	
	@GetMapping(value = "/list")
	public ArrayList<NoticeVO> getNoticeList() {
		return service.getNoticeList();
	}
	
	@PostMapping(value = "/mani")
	public ArrayList<NoticeVO> manipulateNotice(NoticeVO vo, MultipartFile[] files) {
		return service.manipulateNotice(vo, files);
	}
	
	@GetMapping(value = "/detail/{id}")
	public ArrayList<NoticeVO> getNoticeDetail(@PathVariable String id) {
		return service.getNoticeDetail(id);
	}

}
