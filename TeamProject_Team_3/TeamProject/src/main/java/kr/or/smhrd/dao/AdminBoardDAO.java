package kr.or.smhrd.dao;

public interface AdminBoardDAO {
	// �Ű� ���� ����Ʈ
	public void getReportList();
	
	// �Ű� �Խñ� �� ��ȸ
	public void ReportBoardView();
	
	// �Ű� �Խñ� ����
	public void ReportBoardDel();
	
	// �Ű� ��� �� ��ȸ
	public void ReportReplyView();
	
	// �Ű� ��� ����
	public void ReportReplyDel();
	
	// �������� ����Ʈ
	public void getNoticeList();
	
	// �������� �ۼ�
	public void NoticeWriteOk();
	
	// �������� ����
	public void NoticeEditOk();
	
	// ���û��� ����
	public void NoticeDel();
}
