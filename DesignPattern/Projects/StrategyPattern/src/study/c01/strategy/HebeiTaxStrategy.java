package study.c01.strategy;

public class HebeiTaxStrategy implements TaxStrategy{

	@Override
	public void computeTax() {
		System.out.println("Hebei Tax Calculation");
		
	}

}
