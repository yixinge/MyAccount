package cn.yixin.account.domain;

import java.io.Serializable;
import java.util.Date;

public class MainMessage implements Serializable{
	
	private static final long serialVersionUID = 6061869077099027172L;
	
	public static final String TABLE_NAME      = "main_message";
	
	private Integer id;
	private Integer user_id;
	private Integer count_id;
	private String type;
	private String description;
	private Double pay;
	private Date pay_time;
	private String goods_picture;
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
	public Integer getCount_id() {
		return count_id;
	}
	public void setCount_id(Integer count_id) {
		this.count_id = count_id;
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
	public Date getPay_time() {
		return pay_time;
	}
	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}
	public String getGoods_picture() {
		return goods_picture;
	}
	public void setGoods_picture(String goods_picture) {
		this.goods_picture = goods_picture;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
