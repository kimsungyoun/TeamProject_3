package kr.or.smhrd.dao;

import java.util.List;

import kr.or.smhrd.dto.NoticeDTO;
import kr.or.smhrd.dto.ReportDTO;

public interface AdminBoardDAO {
	// �л� ����Ʈ ��� : String -> MemberDTO
	public List<String> getMemberList();
	
	// �л� ���� ��ȸ : void -> MemberDTO 
	public void getMember();
	
	// �л� ���� ���� : �Ķ���� -> MemberDTO dto
	public int memberUpdate();
	
	// �л� ���� ����
	public int memberDel(int no, String id);
	
	// �Ű� ���� ����Ʈ
	public List<ReportDTO> getReportList();
	
	// �Ű� �Խñ� �� ��ȸ
	public ReportDTO ReportBoardView(int no);
	
	// �Ű� �Խñ� ����
	public int ReportBoardDel(int no, String id);
	
	// �Ű� ��� �� ��ȸ
	public ReportDTO ReportReplyView();
	
	// �Ű� ��� ���� 
	public int ReportReplyDel(int no, String id);
	
	// �������� ����Ʈ
	public List<NoticeDTO> getNoticeList();
	
	// �������� �ۼ�
	public int NoticeWriteOk(NoticeDTO dto);
	
	// �������� ����
	public int NoticeEditOk(NoticeDTO dto);
	
	// ���û��� ����
	public int NoticeDel(int no, String id);
}
