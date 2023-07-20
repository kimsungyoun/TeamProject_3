package kr.or.smhrd.dao;

import java.util.List;

import kr.or.smhrd.dto.CommunityDTO;
import kr.or.smhrd.dto.PagingDTO;

public interface CommunityDAO {
	
	// �� ���
	//public int boardWriteOk(CommunityDTO dto); 
	
	// �� ��� ���� 
	public List<CommunityDTO> boardList(PagingDTO pDTO);
	
	// �� ���ڵ� ��
	public int totalRecord(PagingDTO pDTO);
	
	// �Ѱ��� ���ڵ� ����
	//public CommunityDTO getBoard(int no);
	
	// ��ȸ�� ����
	//public void hitCount(int no);
	
	// �ۼ���
	//public int boardEditOk(CommunityDTO dto);
	
	// �� ����
	//public int boardDel(int no, String id);
}
