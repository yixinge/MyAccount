package cn.yixin.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/{name}")
	public String loginForm(@PathVariable String name) {
		return name;
	}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "index";
	}
}
