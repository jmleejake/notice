package com.rsupport.notice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rsupport.notice.vo.NoticeVO;
import org.springframework.web.bind.annotation.RestController;

import com.rsupport.notice.service.INoticeService;

@RequestMapping(value = "/notice")
@RestController
public class NoticeController {
	
	@Autowired
	private INoticeService service;
	
	@ResponseBody
	@GetMapping(value = "/list")
	public ArrayList<NoticeVO> getNoticeList() {
		return service.getNoticeList();
	}
	
	@ResponseBody
	@PostMapping(value = "/mani")
	public ArrayList<NoticeVO> manipulateNotice(NoticeVO vo) {
		return service.manipulateNotice(vo);
	}
	
	@ResponseBody
	@GetMapping(value = "/detail/{id}")
	public ArrayList<NoticeVO> getNoticeDetail(@PathVariable String id) {
		return service.getNoticeDetail(id);
	}

}
