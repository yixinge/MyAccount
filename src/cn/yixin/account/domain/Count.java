package cn.yixin.account.domain;

import java.io.Serializable;

public class Count implements Serializable{
	
	private static final long serialVersionUID = -5093869021742456464L;
	
	public static final String TABLE_NAME      =     "tb_count";
	
	private Integer id;
	private Integer user_id;
	private String countName;
	private String countDescription;
	private Integer status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getCountName() {
		return countName;
	}
	public void setCountName(String countName) {
		this.countName = countName;
	}
	public String getCountDescription() {
		return countDescription;
	}
	public void setCountDescription(String countDescription) {
		this.countDescription = countDescription;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
