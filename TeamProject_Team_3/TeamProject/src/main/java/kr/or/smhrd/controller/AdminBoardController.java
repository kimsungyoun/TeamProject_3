package kr.or.smhrd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.or.smhrd.service.AdminBoardService;

@RestController
@RequestMapping("/admin")
public class AdminBoardController {
	@Autowired
	AdminBoardService service;
	
	// ������ �������� �̵�
	@GetMapping("/adminList")
	public ModelAndView boardList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/adminList");
		return mav;
	}
	
	// �Ű� ���� ����Ʈ
		
	// �Ű� �Խñ� �� ��ȸ
		
	// �Ű� �Խñ� ����
		
	// �Ű� ��� �� ��ȸ
		
	// �Ű� ��� ����
		
	// �������� ����Ʈ
		
	// �������� �ۼ�
		
	// �������� ����
		
	// ���û��� ����
	
}
