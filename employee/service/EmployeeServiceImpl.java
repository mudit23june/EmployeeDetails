package com.employee.service;

import java.util.List;

import com.employee.beans.Address;
import com.employee.beans.Employee;
import com.employee.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

	int i=1;
	public EmployeeServiceImpl(EmployeeRepo er) {
		// TODO Auto-generated constructor stub
		super();
		this.er = er;
	}

	EmployeeRepo er;
	Employee e;
	
	@Override
	public Employee createEmployee(String employee, Address address) {
		// TODO Auto-generated method stub
		e = new Employee(employee, i, address);
		i = i+1;
		return er.save(e);
	}

	@Override
	public List<Employee> searchByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> list = er.findByName(name);
		return list;
	}

}
