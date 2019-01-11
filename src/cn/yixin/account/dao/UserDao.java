package cn.yixin.account.dao;

import org.apache.ibatis.annotations.Select;

import cn.yixin.account.domain.User;

public interface UserDao {
	
	@Select("select * from "+User.TABLE_NAME+" where login_name = #{loginName} and password = #{password}")
	User selectByNameAndPassword(String loginName, String password);
	
}
