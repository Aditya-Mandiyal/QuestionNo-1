package com.godigit.springbootusingintialiazr.SpringBootUsingIntialiazr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/home")
	@ResponseBody
	public String show() {
		return "Hello,I Create This Spring Boot Project using Intializer";
	}
	
}
