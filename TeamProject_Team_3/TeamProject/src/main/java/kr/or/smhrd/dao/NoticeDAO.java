package kr.or.smhrd.dao;

import java.util.List;

import kr.or.smhrd.dto.NoticeDTO;
import kr.or.smhrd.dto.ReportDTO;

public interface NoticeDAO {
	// �������� ����Ʈ
	public List<NoticeDTO> getNoticeList();
	
	// �������� �ۼ�
	public int NoticeWriteOk(NoticeDTO dto);
	
	// �������� ����
	public int NoticeEditOk(NoticeDTO dto);
	
	// ���û��� ����
	public int NoticeDel(int no, String id);
}
