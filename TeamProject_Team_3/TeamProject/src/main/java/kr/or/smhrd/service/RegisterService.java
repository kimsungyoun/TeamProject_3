package kr.or.smhrd.service;


import kr.or.smhrd.dto.RegisterDTO;

public interface RegisterService {
	//ȸ������
	public int registerInsert(RegisterDTO dto);
	// ���̵� �ߺ�üũ
	public int idCheck(String mem_id);
}
