package com.luv2code.springdemo.controllers;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.beans.Order;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping("/showform")
	public String getOrder(Model model) {
		model.addAttribute("order", new Order());
		
		return "order-form";
		
	}
	
	@RequestMapping("/processform")
	public String processForm(@Valid @ModelAttribute("order") Order theOrder, BindingResult theBindingResult) {
		
	    if(theBindingResult.hasErrors()) { 
	    	System.out.println("Binding Result:" + theBindingResult);
	    	return "order-form"; 
	    }
		 
		
		return "order-confirmation";
	}
	
	@InitBinder
	public void trimWhitespaces(WebDataBinder dataBinder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		
		dataBinder.registerCustomEditor(String.class, trimmer);
	}
	
}
