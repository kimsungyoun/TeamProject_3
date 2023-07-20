package kr.or.smhrd.dao;

import java.util.List;

import kr.or.smhrd.dto.NoticeDTO;
import kr.or.smhrd.dto.PagingDTO;

public interface NoticeDAO {
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
