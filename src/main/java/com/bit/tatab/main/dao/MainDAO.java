package com.bit.tatab.main.dao;

import java.util.List;

import com.bit.tatab.main.vo.CommentVO;
import com.bit.tatab.main.vo.MainBackgroundVO;
import com.bit.tatab.main.vo.ProjectVO;

public interface MainDAO {
	
	// 새 코멘트 info db에 추가
	public void modifyComment(CommentVO commentVO);
	
	// 프로젝트 생성
	public void insert(ProjectVO project, String login_email);
	
	// 해당 id가 속한 프로젝트 리스트 불러오기
	public List<String> selectAllProject(String login_email);

	// 배경 이미지 업로드
	public void modifyBackgroundImage(MainBackgroundVO mainBackgroundVO);

	// 배경 이미지 불러오기
	public MainBackgroundVO findBackgroundImage(String login_email);

	// 배경 이미지 삭제
	public void deleteBackroundImage(String login_email);

	
}
