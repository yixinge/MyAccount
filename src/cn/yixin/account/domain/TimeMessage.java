package cn.yixin.account.domain;

import java.io.Serializable;

public class TimeMessage implements Serializable{
	
	private static final long serialVersionUID = 2733433178644257806L;
	
	public static final String   TABLE_NAME    = "time_message";
	
	private Integer id;
	private Integer main_message_id;
	private Integer year;
	private Integer month;
	private Integer week;
	private Integer day;
	private Integer hour;
	private Integer minute;
	private Integer second;
	private Integer status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMain_message_id() {
		return main_message_id;
	}
	public void setMain_message_id(Integer main_message_id) {
		this.main_message_id = main_message_id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getWeek() {
		return week;
	}
	public void setWeek(Integer week) {
		this.week = week;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Integer getMinute() {
		return minute;
	}
	public void setMinute(Integer minute) {
		this.minute = minute;
	}
	public Integer getSecond() {
		return second;
	}
	public void setSecond(Integer second) {
		this.second = second;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
