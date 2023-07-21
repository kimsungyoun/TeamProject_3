package kr.or.smhrd.controller;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.or.smhrd.dto.RegisterDTO;
import kr.or.smhrd.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	RegisterService service;
	@Autowired
	JavaMailSenderImpl mailSender;
	
	//ȸ������
	@GetMapping("/regForm")
	public String regForm() {
		return "register/regForm";
	}
	
	// ȸ������ üũ
	@PostMapping("/registerOk")
	public ModelAndView registerOk(RegisterDTO dto) {
		System.out.println(dto.toString());
		int result = 0;
		try {
			result = service.registerInsert(dto);
		}catch(Exception e) {
			System.out.println("ȸ������ ����....");		
		}
		ModelAndView mav = new ModelAndView();
		if(result > 0) {
			mav.setViewName("redirect:/");
		}else {
			mav.setViewName("register/registerResult");
		}
	return mav;
	}
	
	//���̵� �ߺ�üũ
	@PostMapping("/idCheck")
	@ResponseBody
	public int idCheck(@RequestParam("mem_id") String mem_id) {
		int cnt = service.idCheck(mem_id);
		return cnt;
	}
	
	// �α���
	@GetMapping("/login")
	public String login() {
	   return "register/login";
	}

	// �α��� Ȯ��
	@PostMapping("/loginOk")
	public ModelAndView loginOk(String mem_id, String mem_password, HttpSession session) {
		RegisterDTO dto = service.loginOk(mem_id, mem_password);
		ModelAndView mav = new ModelAndView();
		if(dto!=null) {
			session.setAttribute("logId", dto.getMem_id());
			session.setAttribute("logType", dto.getMem_type());
			session.setAttribute("logCa", dto.getMem_ca());
			session.setAttribute("logStatus", "Y");
			 
			 mav.setViewName("redirect:/");
		}else {
			mav.setViewName("redirect:login");
		}
		return mav;
	}
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
	}
	
	//��й�ȣ ã�� (��)
	@GetMapping("/passwordSearch")
	public String passwordSearchForm() {
		return "register/passwordSearch";
	}
	
	// ��й�ȣ ã��
	@PostMapping("/passwordSearchOk")
	@ResponseBody
	public String passwordSearchOk(@RequestBody RegisterDTO dto) {
		//�̸�, ����ó�� ��ġ�ϴ� ���̵�� �̸����� ���Ѵ�. 
		RegisterDTO resultDTO = service.passwordSearch(dto);
		String resultTxt = "N";
		if(resultDTO!=null) { //��ġ�ϴ� ������ ������
	 //�̸��� ������ 
	try {   
		String subject = "��й�ȣ ã�� ���";
		String content = "<div style='background:pink; border:1px solid #ddd; padding:50px; text-align:center'>";
		   
		content += "�˻��� ��й�ȣ�� :"+ resultDTO.getMem_password();
		content += "</div>";
		  
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
		messageHelper.setFrom("smshrd@naver.com");
		messageHelper.setTo("smshrd@naver.com");
		messageHelper.setSubject(subject);
		messageHelper.setText("text/html; charset=UTF-8", content);
		
		mailSender.send(message);
		
		resultTxt = "Y";
		System.out.println(resultTxt);
	}catch(Exception e) {
		e.printStackTrace();  
	} 
	}else { //��ġ�ϴ� ������ ������
		resultTxt = "N";
	}    
		return resultTxt;
	}
}