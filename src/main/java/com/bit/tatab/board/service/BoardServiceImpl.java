package com.bit.tatab.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bit.tatab.board.dao.BoardDAO;
import com.bit.tatab.main.vo.ProjectVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO boardDao;

	@Override
	public ProjectVO selectAllProjectManage(String projectName) {
		ProjectVO projectManage = boardDao.selectAllProjectManage(projectName);
		return projectManage;
	}

	@Override
	public void updateProjectVO(ProjectVO projectVO, String projectName) {
		boardDao.updateProjectVO(projectVO, projectName);
	}

	
	
	
}
