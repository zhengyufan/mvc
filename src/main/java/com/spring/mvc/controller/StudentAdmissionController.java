package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Student;

@Controller
public class StudentAdmissionController {

	private final static String msg = "Welcome to Yufan College";
	
	@ModelAttribute
	public void addCommonObject(Model model){
		model.addAttribute("msg", msg);
	}
	
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView mv = new ModelAndView("admission-form");
		return mv;
	}
	
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student ) {
		
		ModelAndView mv = new ModelAndView("submit-admission-form");
		return mv;
	}
}
