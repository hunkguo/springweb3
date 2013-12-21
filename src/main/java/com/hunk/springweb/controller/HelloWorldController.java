package com.hunk.springweb.controller;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.servlet.mvc.Controller;

//ʵ��Controller�ӿ�  
public class HelloWorldController implements Controller {  
    
  public ModelAndView handleRequest(HttpServletRequest arg0,  
          HttpServletResponse arg1) throws Exception {  
      ModelAndView mv = new ModelAndView();  
      mv.addObject("message", "��ã�WELCOME  Spring MVC!");  
      mv.setViewName("hello");  
      return mv;  
  }  
}  
