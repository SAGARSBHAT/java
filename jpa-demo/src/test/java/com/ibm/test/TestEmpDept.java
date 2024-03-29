package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ibm.dao.EmpDeptDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class TestEmpDept {
	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new EmpDeptDao();
	}
	
 
	@Disabled
	@Test
	public void testSaveDept() {
		Department dept = new Department(20,"Finance");
		dao.addDept(dept);
	}
	
	@Disabled
	@Test
	public void testSaveEmp() {
		Employee emp = new Employee("Polo",2500);
		dao.addEmp(emp, 20); // the integer in addEmp is deptId
	}

	@Disabled
	@Test
	public void testRemoveDept() {
		dao.removeDept(20);
	}
	
	@Test
	public void testFindDept() {
		Department dept = dao.findDept(20);
		System.out.println(dept);
		dept.getEmps().forEach(System.out::println);
	}

}
