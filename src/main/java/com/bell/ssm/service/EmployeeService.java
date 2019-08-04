package com.bell.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bell.ssm.bean.Employee;
import com.bell.ssm.mapper.EmployeeMapper;

@Service
public class EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;
	
	public List<Employee> getEmps() {
		return employeeMapper.getEmps();
	}
	
}
