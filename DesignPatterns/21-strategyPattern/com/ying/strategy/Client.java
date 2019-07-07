package com.ying.strategy;

import com.ying.strategy.*;

public class Client {

	public static void main(String[] args) {
		Employee e = new Employee(); 
		e.setStrategy(new HebeiTaxStrategy());
		
		e.compute();
	}

}
