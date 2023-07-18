package kr.or.smhrd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminBoardDTO {
	// ������
	private int admin_num;
	private String mem_id;
	
	// �Ű�
	private int report_num;
	private String report_content;
	private String report_wdate;
	
	// ����
	private int notice_num;
	private String notice_title;
	private String notice_content;
	private String notice_wdate;
	private String notice_update;
	
}
