package com.employee.repo;

import java.util.List;

import com.employee.beans.Employee;

public interface EmployeeRepo {
	Employee save(Employee e);
	List<Employee> findByName(String name);
}
