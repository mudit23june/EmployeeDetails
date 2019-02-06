package com.employee.service;

import java.util.List;

import com.employee.beans.Address;
import com.employee.beans.Employee;

public interface EmployeeService {
	Employee createEmployee(String name, Address address);
	List<Employee> searchByName(String name);
}
