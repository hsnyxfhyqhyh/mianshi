
***************************
* Chain of Responsibility *
***************************

http://www.newthinktank.com/2012/10/chain-of-responsibility-design-pattern-tutorial/

This pattern sends data to an object and if that object can't use the data, it sends the data to the next object that may be able to use it. 

STEPS: 

creates a Chain Interface with 2 method, setNextChain and calculate. 
Creates 4 concrete classes implementing the same chain interface, with different implementation in the same override function calculate. 
Client class create instance for each Concrete class, and set up them in the chain. 
	use the 1st chain object to do the calculation. If can handle, calculate it; otherwise, pass it to the next chain object. 
	
	  
>> Reviewed
	on 7/10/2019 for 2nd time. 