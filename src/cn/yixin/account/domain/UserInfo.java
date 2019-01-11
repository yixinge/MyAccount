package cn.yixin.account.domain;

import java.io.Serializable;

public class UserInfo implements Serializable{

	private static final long serialVersionUID = -8027847276147023825L;

	public static final String TABLE_NAME		 =    "user-info";
	
	private Integer id;
	private Integer userId;
	private String userName;
	private String profilePicture;
	private String gender;
	private Integer age;
	private String tel;
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfile_picture() {
		return profilePicture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profilePicture = profile_picture;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
