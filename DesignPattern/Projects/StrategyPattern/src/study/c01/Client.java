package study.c01;

import study.c01.strategy.HebeiTaxStrategy;

public class Client {

	public static void main(String[] args) {
		Employee e = new Employee(); 
		e.setStrategy(new HebeiTaxStrategy());
		
		e.compute();
	}

}
