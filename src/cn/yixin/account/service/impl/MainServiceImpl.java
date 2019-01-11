package cn.yixin.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.yixin.account.dao.CountDao;
import cn.yixin.account.dao.MainMessageDao;
import cn.yixin.account.dao.TimemessageDao;
import cn.yixin.account.dao.UserDao;
import cn.yixin.account.dao.UserInfoDao;
import cn.yixin.account.domain.User;
import cn.yixin.account.service.MainService;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service
public class MainServiceImpl implements MainService{
	@Autowired
	private UserDao userDao;
	@Autowired
	private CountDao countDao;
	@Autowired
	private MainMessageDao mainMessageDao;
	@Autowired
	private TimemessageDao timemessageDao;
	@Autowired
	private UserInfoDao userInfoDao;
	
	public User doLogin(String loginName,String password) {
		return userDao.selectByNameAndPassword(loginName,password);
	}
	
	
	
	
	
}
