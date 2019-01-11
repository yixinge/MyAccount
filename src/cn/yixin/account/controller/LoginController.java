package cn.yixin.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.yixin.account.domain.User;
import cn.yixin.account.service.MainService;
import cn.yixin.account.validator.LoginValidator;

@Controller
public class LoginController {
	@Autowired
	private LoginValidator loginValidator;
	@Autowired
	private MainService mainService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String toLogin(Model model) {
		model.addAttribute(new User());
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String doLogin(User user,Errors errors) {
		/*loginValidator.validate(user, errors);*/
		mainService.doLogin(user.getLoginName(), user.getPassWord());
		return "main";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET )
	public String toRegister(Model model) {
		model.addAttribute(new User());
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST )
	public String doRegister(User user,Errors errors) {
		loginValidator.validate(user, errors);
		mainService.doLogin(user.getLoginName(), user.getPassWord());
		return "main";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
