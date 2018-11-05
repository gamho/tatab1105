package com.bit.tatab.board.dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bit.tatab.main.vo.ProjectVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession sqlSession;

	@Override
	public ProjectVO selectAllProjectManage(String projectName) {
		
		ProjectVO projectVO = sqlSession.selectOne("selectAllProjectManage", projectName);
		System.out.println(projectVO);
		
		return projectVO;
	}

	@Override
	public void updateProjectVO(ProjectVO projectVO, String projectName) {
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("updateName", projectVO.getProject_name());
		param.put("updateDescription",projectVO.getProject_comment());
		param.put("projectName", projectName);
		
		sqlSession.update("updatePRJ_T", param);
		sqlSession.update("updateProject_List", param);
	}
	
	
}
