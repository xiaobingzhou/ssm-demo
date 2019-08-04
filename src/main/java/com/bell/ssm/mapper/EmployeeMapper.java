package com.bell.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bell.ssm.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getEmployeeById(Integer id);
	
	public boolean updateEmp(Employee employee);
	
	public boolean addEmp(Employee employee);
	
	public boolean deleteEmpById(Integer id);
	
	public boolean deleteEmpsBatch(@Param("ids")List<Integer> ids);

	public List<Employee> getEmps();
}
