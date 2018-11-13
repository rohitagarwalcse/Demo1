package com.Spring.Main;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping("/")
	
	public String calling() {
		return "NewFile.html";
	}
	
	@RequestMapping("/NewFile")
	public String loginPage(Map<String,Object> model) {
		model.put("name", "Hello");
		return "NewFile.html";
	}
	
}
