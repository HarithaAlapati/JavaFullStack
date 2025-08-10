package com.haritha.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.haritha.webapp.Alien;

import jakarta.security.auth.message.callback.SecretKeyCallback.Request;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class AppController {
	@RequestMapping("/home1") 
	
	  //Using Servlets
	 /*  public String home(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("name is: " + name);
		session.setAttribute("name", name);
		return "home1";
	}*/
	
	// using both ModelandView effective way then the servlets
/*	public ModelAndView home(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home1");
		return mv;
	}*/
	
	//send a object to access all fields using obj 
	//http://localhost:1002/home1?aid=101&aname=Haritha&lang=Java
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home1");
		return mv;
		
	}

}
