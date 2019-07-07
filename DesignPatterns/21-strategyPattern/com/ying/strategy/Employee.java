package com.ying.strategy;

import com.ying.strategy.*;

public class Employee {
	private String firstName; 
	

	private String lastName; 
	
	private TaxStrategy strategy; 
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public TaxStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(TaxStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void compute() {
		strategy.computeTax();
	}
}
