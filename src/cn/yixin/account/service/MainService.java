package cn.yixin.account.service;

import cn.yixin.account.domain.User;

public interface MainService {
	User doLogin(String loginName,String password);
}
