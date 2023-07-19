package kr.or.smhrd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.or.smhrd.dto.NoticeDTO;
import kr.or.smhrd.dto.ReportDTO;
import kr.or.smhrd.service.NoticeService;
import kr.or.smhrd.service.ReportService;

@RestController
@RequestMapping("/admin")
public class AdminBoardController {
/* 
	@Autowired 
	MemberService mService; 
*/
	
	@Autowired
	ReportService rService;
	
	@Autowired
	NoticeService nService;
	
	// ������ �������� �̵�
	@GetMapping("/adminList")
	public ModelAndView boardList() {
		ModelAndView mav = new ModelAndView();
		
		// �л� ����Ʈ
		/* mav.addObject("member", ); */
		
		// �Ű� ���� ����Ʈ
		mav.addObject("report",rService.getReportList());
		System.out.println(rService.getReportList());
		
		// �������� ����Ʈ
		mav.addObject("notice",nService.getNoticeList());
		System.out.println(nService.getNoticeList());
		
		mav.setViewName("admin/adminBoard");
		
		return mav;
	}
	
	// �Ű� �Խñ� �� ��ȸ
	
	
	// �Ű� �Խñ� ����
	
	
	// �Ű� ��� �� ��ȸ
	
	
	// �Ű� ��� ����

	
	// �������� �ۼ�
	
	
	// �������� ����
		
	
	// ���û��� ����

	
}
