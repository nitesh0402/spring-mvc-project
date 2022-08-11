package com.sorting;

public class Employee implements Comparable<Employee>{
	int empCode;
	String name;
	int salary;
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int empCode, String name, int salary) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

}
