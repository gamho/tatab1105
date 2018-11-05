package com.bit.tatab.board.dao;

import com.bit.tatab.main.vo.ProjectVO;

public interface BoardDAO {

	// board - projectManage 데이터 가져오기
	public ProjectVO selectAllProjectManage(String projectName);
	
	// projectManage data update
	public void updateProjectVO(ProjectVO projectVO, String projectName);
}
