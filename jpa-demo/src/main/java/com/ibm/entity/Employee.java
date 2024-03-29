package com.ibm.entity;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid = "+empId+", empName = "+empName+", salary = "+salary+"]";
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
