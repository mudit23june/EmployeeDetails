package com.employee.view;

import java.util.List;

import com.employee.beans.Address;
import com.employee.beans.City;
import com.employee.beans.Country;
import com.employee.beans.Employee;
import com.employee.repo.EmployeeRepo;
import com.employee.repo.EmployeeRepoImpl;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;

public class View {
	public static void main(String[] args)
	{
		EmployeeRepo er = new EmployeeRepoImpl();
		EmployeeService es = new EmployeeServiceImpl(er);
		//Employee emp1,emp2,emp3,emp4;
		Address ad1 = new Address("colony",new Country("India",new City("Delhi")));
		Address ad2 = new Address("colony",new Country("UK",new City("London")));
		Address ad3 = new Address("colony",new Country("US",new City("Dallas")));
		Address ad4 = new Address("colony",new Country("Aus",new City("Melbourne")));
		
		
		es.createEmployee("Mudit", ad1);
		es.createEmployee("ABC", ad2);
		es.createEmployee("DEF", ad3);
		es.createEmployee("GHI", ad4);
		List<Employee> list = es.searchByName("GHI");
		for(Employee e : list)
			System.out.println(e);
		//System.out.println(emp.getAddress().getAddressLine());
	}
}
