package com.employee.repo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.employee.beans.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {

	
	HashMap<Integer, Employee> h = new HashMap<>();
	
	@Override
	public Employee save(Employee e) {
		// TODO Auto-generated method stub
		h.put(e.getId(), e);
		return e;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> empList = new LinkedList<Employee>();
		for(Entry<Integer, Employee> entry : h.entrySet())
		{
			if(entry.getValue().getName().equals(name))
			{
				empList.add(entry.getValue());
			}
		}
		return empList;
	}

}
