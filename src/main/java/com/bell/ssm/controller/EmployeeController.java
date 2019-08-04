package com.bell.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bell.ssm.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/emps")
	public String getEmps(Map<String, Object> model) {
		model.put("emps", employeeService.getEmps());
		return "list";
	}
}
