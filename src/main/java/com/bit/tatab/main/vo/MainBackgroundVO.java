package com.bit.tatab.main.vo;

public class MainBackgroundVO {
	
	private String login_email;
	private String ori_name;
	private String save_name;
	public MainBackgroundVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MainBackgroundVO(String login_email, String ori_name, String save_name) {
		super();
		this.login_email = login_email;
		this.ori_name = ori_name;
		this.save_name = save_name;
	}
	public String getLogin_email() {
		return login_email;
	}
	public void setLogin_email(String login_email) {
		this.login_email = login_email;
	}
	public String getOri_name() {
		return ori_name;
	}
	public void setOri_name(String ori_name) {
		this.ori_name = ori_name;
	}
	public String getSave_name() {
		return save_name;
	}
	public void setSave_name(String save_name) {
		this.save_name = save_name;
	}
	@Override
	public String toString() {
		return "MainBackgroundVO [login_email=" + login_email + ", ori_name=" + ori_name + ", save_name=" + save_name
				+ "]";
	}
	
	
}
