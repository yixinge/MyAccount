package cn.yixin.account.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User implements Serializable{
	private static final long serialVersionUID = -1996633962116187335L;
	
	public static final String TABLE_NAME        =         "user";
	
	private Integer id;
	@NotNull
	@Size(min=3,max=9,message="{loginName.size}")
	private String loginName;
	@NotNull
	@Size(min=3,max=15,message="{password.size}")
	private String passWord;
	@NotNull
	@Size(min=3,max=9,message="{username.size}")
	private String userName;
	private String userIdentity;
	private Integer userStatus;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	
}
