package kr.or.smhrd.service;

import java.util.List;

import kr.or.smhrd.dto.NoticeDTO;
import kr.or.smhrd.dto.PagingDTO;
import kr.or.smhrd.dto.ReportDTO;

public interface NoticeService {
	// �������� ����Ʈ
	public List<NoticeDTO> getNoticeList();
		
	// �������� ����ȸ
	public NoticeDTO selectNotice(int no);
		
	// �������� �ۼ�
	public int NoticeWriteOk(NoticeDTO dto);
		
	// �������� ����
	public int NoticeEdit(NoticeDTO dto);
		
	// ���û��� ����
	public int NoticeDel(int no, String id);
	
	// ��ȸ�� ����
	public void hitCount(int no);
	// �� ���ڵ� ��
	public int totalRecord(PagingDTO pDTO);
}
