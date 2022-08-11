package com.OneToMany.pojo1;

import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private int salary;
	
	private List<Address> add;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Address> getAdd() {
		return add;
	}

	public void setAdd(List<Address> add) {
		this.add = add;
	}

	public Employee(int empId, String empName, int salary, List<Address> add) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.add = add;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", add=" + add + "]";
	}
	
	
	
}
