package kr.or.smhrd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.or.smhrd.dto.NoticeDTO;
import kr.or.smhrd.dto.PagingDTO;
import kr.or.smhrd.dto.ReportDTO;
import kr.or.smhrd.service.NoticeService;
import kr.or.smhrd.service.ReportService;

@RestController
@RequestMapping("/admin")
public class AdminBoardController {
/* 
	@Autowired 
	RegisterService mService; 
*/
	
	@Autowired
	ReportService rService;
	
	@Autowired
	NoticeService nService;
	
	// ������ �������� �̵�
	@GetMapping("/adminList")
	public ModelAndView boardList(PagingDTO pDTO) {
		ModelAndView mav = new ModelAndView();
		
		// �л� ����Ʈ
		/* mav.addObject("member", mService.getMemberList()); */
		
		// �Ű� ���� ����Ʈ
		mav.addObject("report",rService.getReportList());
		
		// �������� ����Ʈ
		mav.addObject("notice",nService.NoticeList(pDTO));
		
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
