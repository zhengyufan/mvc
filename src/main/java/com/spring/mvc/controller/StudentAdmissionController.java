package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Student;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView mv = new ModelAndView("admission-form");
		return mv;
	}
	
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name, @RequestParam("studentID") String id ) {
		
		ModelAndView mv = new ModelAndView("submit-admission-form");
		String msg = "Your name is " + name + ", and your ID is: " + id;
		Student student = new Student(name, id);
		mv.addObject("msg",msg);
		mv.addObject("student", student);
		return mv;
	}
}
