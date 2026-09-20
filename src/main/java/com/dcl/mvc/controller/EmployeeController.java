package com.dcl.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dcl.mvc.entity.Employee;
import com.dcl.mvc.service.EmployeeService;

@Controller
public class EmployeeController 
{
//	@Autowired
//	public EmployeeService empService;
//	
//	public String saveEmployee(Employee e)
//	{
//		String msg = empService.saveData(e);
//		return msg;
//	}
	
	@Autowired
	public EmployeeService empService;
	
	@GetMapping("/")
	public String showform(Model model)
	{
		model.addAttribute("employee",new Employee());
		return "index"; //This maps to /WEB_INF/index.jsp	
	}
	
	@PostMapping("/sendData")
	public String saveEmployee(@ModelAttribute("employee") Employee e, Model model)
	{
		String msg = empService.saveData(e);
		model.addAttribute("message",msg);
		return "output";
	}
}
