package com.employee.beans;

public class Employee {
		private String name;
		private Address address;
		private int id;
		public Employee(String name, int i, Address address) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.id = i;
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
		}
}
