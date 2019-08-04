package com.bell.ssm.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bell.ssm.bean.Employee;
import com.bell.ssm.mapper.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class EmployeeMapperTest {

	@Autowired
	EmployeeMapper employeeMapper;
	
	@Test
	public final void testGetEmps() {
		List<Employee> emps = employeeMapper.getEmps();
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	}

}
