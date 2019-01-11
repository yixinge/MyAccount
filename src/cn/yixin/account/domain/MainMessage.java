package cn.yixin.account.domain;

import java.io.Serializable;
import java.util.Date;

public class MainMessage implements Serializable{
	
	private static final long serialVersionUID = 6061869077099027172L;
	
	public static final String TABLE_NAME      = "main_message";
	
	private Integer id;
	private Integer userId;
	private Integer countId;
	private String type;
	private String description;
	private Double pay;
	private Date payTime;
	private String goodsPicture;
	private Integer status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return userId;
	}
	public void setUser_id(Integer user_id) {
		this.userId = user_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPay() {
		return pay;
	}
	public void setPay(Double pay) {
		this.pay = pay;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCountId() {
		return countId;
	}
	public void setCountId(Integer countId) {
		this.countId = countId;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getGoods_picture() {
		return goodsPicture;
	}
	public void setGoods_picture(String goods_picture) {
		this.goodsPicture = goods_picture;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
