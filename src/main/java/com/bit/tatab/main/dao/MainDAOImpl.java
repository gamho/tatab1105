package com.bit.tatab.main.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bit.tatab.main.vo.CommentVO;
import com.bit.tatab.main.vo.MainBackgroundVO;
import com.bit.tatab.main.vo.ProjectVO;


@Repository
public class MainDAOImpl implements MainDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public void insert(ProjectVO project, String login_email) {
		
		// PRJ_T ??insert (register)
		sqlSession.insert("insert", project);
		
		// PROJECT_LIST_T ??insert
		String name = project.getProject_name();
		System.out.println("name : " + name + "email  : " + login_email);

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("name", name);
		param.put("login_email", login_email);
		
		sqlSession.insert("insert_prj_list_t", param );
	
	}

	@Override
	public List<String> selectAllProject(String login_email) {
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("login_email", login_email);
		
		List<ProjectVO> projectList = sqlSession.selectList("selectAllProject", param);
		List<String> projectNameList = new ArrayList<String>();
		
		for(int i=0; i<projectList.size(); i++) {
			projectNameList.add( projectList.get(i).getProject_name());
		}
		
		System.out.println("dao selectAllProject()" + projectNameList);
		return projectNameList;
	}

	@Override
	public void modifyComment(CommentVO commentVO) {
		sqlSession.update("modifyComment", commentVO);
	}

	@Override
	public void modifyBackgroundImage(MainBackgroundVO mainBackgroundVO) {
		sqlSession.insert("modifyBackgroundImage", mainBackgroundVO);
	}

	@Override
	public MainBackgroundVO findBackgroundImage(String login_email) {
		MainBackgroundVO backgroundImage = sqlSession.selectOne("findBackgroundImage", login_email);
		return backgroundImage;
	}

	@Override
	public void deleteBackroundImage(String login_email) {
		sqlSession.delete("deleteBackroundImage", login_email);
	}
	
	

}
