package com.bit.tatab.board.service;

import com.bit.tatab.main.vo.ProjectVO;

public interface BoardService {

	// board - ProjectMange 데이터 가져오기
	public ProjectVO selectAllProjectManage(String projectName);
	
	// projectManage data update
	public void updateProjectVO(ProjectVO projectVO, String projectName);
		
}
