package com.dcl.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.mvc.entity.Employee;
import com.dcl.mvc.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
	@Autowired
	public EmployeeRepo empRepo;
	
	public String saveData(Employee e)
	{
		String msg = empRepo.saveEmployee(e);
		return msg;
	}
}
