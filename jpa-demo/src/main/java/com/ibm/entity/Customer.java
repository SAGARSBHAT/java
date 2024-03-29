package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "customers")
public class Customer {
	@Id //to set primary field
	@Column (name  = "custId")
	private int custId;
	@Column(name = "cname", length = 30)//By default length is take an 256
	private String custName;
	@Column(name = "cr_limit")
	private double creditLimit;
	
	public Customer() {
	}

	public Customer(int custId, String custName, double creditLimit) {
		this.custId = custId;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "Customer [custId= "+ custId +", custName=" + custName+", creditLimit=" + creditLimit + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	

}
