package com.luv2code.springdemo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@RequestMapping("/showform")
	public String showForm() {
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String getStudentPage() {
		return "student";
	}
	
	@RequestMapping("/showDetailedform")
	public String showDetailedForm() {
		return "student-detailed-form";
	}
	
	@RequestMapping("/processDetailedform")
	public String getDetailedStudentPage(HttpServletRequest request,Model model) {
		
		String name = request.getParameter("name").toUpperCase();
		model.addAttribute("u_name",name);
		
		String age = request.getParameter("age");
		model.addAttribute("u_age",age);
		
		String course = request.getParameter("course").toUpperCase();
		model.addAttribute("u_course",course);
		
		return "student-display";
	}
	
	@RequestMapping("/showDetailedform2")
	public String showDetailedForm2() {
		return "student-detailed-form2";
	}
	
	@RequestMapping("/processDetailedform2")
	public String getDetailedStudentPage(@RequestParam String name,@RequestParam int age,
						@RequestParam String course,Model model) {
		
		
		model.addAttribute("u_name",name.toUpperCase());
		
		model.addAttribute("u_age",age);
		
		model.addAttribute("u_course",course.toUpperCase());
		
		return "student-display";
	}
}
