package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.CustomerDao;
import com.ibm.entity.Customer;
import java.util.List;

public class TestCustomer {
	private static CustomerDao dao;
	
	@BeforeAll
	public static void init() {
		dao = new CustomerDao();
	}
	
	@Test
	public void testSave() {
		Customer c = new Customer(102,"Frank",3000);
		dao.save(c);
	}
	
	@Test
	public void testFetch() {
		Customer c =dao.fetch(101);
		assertNotNull(c);
		System.out.println(c);
	}

	@Test
	public void testList() {
		List<Customer> customers = dao.list();
		assertFalse(customers.isEmpty());
		customers.forEach(System.out::println);
	}
	
	@Test
	public void testUpdate() {
		Customer c =new Customer(101,"Polo",2000);
		assertTrue(dao.update(c));
	}
	
	@Test
	public void testDelete() {
		System.out.println(dao.delete(101));
	}
		
	}



