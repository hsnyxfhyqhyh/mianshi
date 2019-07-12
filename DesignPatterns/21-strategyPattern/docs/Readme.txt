*********************
* strategy  pattern *
*********************

http://www.newthinktank.com/2012/08/strategy-design-pattern-tutorial/

Note:

this is a simple pattern. Assuming different state has different method to calculate the tax for its employees. 

create an interface TaxStrategy with one method computeTax. 

create a concrete class HebeiTaxStrategy to implement the interface. 

Employee is the class which declare a variable as TaxStrategy interface type, it also has a setStrategy method to accept a TaxStratgy type. 

Client creates an employee, then creates a concrete HebeiStratgy type, then calls employee's setStrategy method to pass in the concrete Strategy. 

Client then calls employee's compute function to call the strategy's computeTax method. 

>> Reviewed 
	on 7/12 for the 2nd time.  