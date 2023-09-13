package com.Lloren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Lloren.entity.User;
import com.Lloren.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/signup")
	public String signUp(Model model) {

		model.addAttribute("user", new User());

		return "signup";

	}

	@PostMapping("/signup")
	public ModelAndView signUp(@ModelAttribute User user, Model model) {
		
		try {
			userService.save(user);
			return new ModelAndView("redirect:/","user",user);
		}catch(Exception e){
			return new ModelAndView("signup", "msg", "could not work please retry");		
		}
			
	}
	
	
	@GetMapping("/signin")
	public String signIn(Model model) {
		model.addAttribute("user", new User());
		return "signin";
	}
	
	@PostMapping("/signin")
	public ModelAndView signIn(@ModelAttribute User user, Model model) {
		
		try {
			User loggedInUser = userService.signIn(user);
			return new ModelAndView("redirect:/","user",loggedInUser);
			
		}catch(Exception e){
			return new ModelAndView("signin", "msg", e.getMessage() );
		}
		
		
		
		
	}
	
	

}
