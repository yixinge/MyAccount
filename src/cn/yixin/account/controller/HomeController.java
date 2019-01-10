package cn.yixin.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/{name}")
	public String loginForm(@PathVariable String name) {
		return name;
	}
}
