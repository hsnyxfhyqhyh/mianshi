***********************
* Interpreter pattern *
***********************

http://www.newthinktank.com/2012/10/interpreter-design-pattern-tutorial/

>> Note: 

According to Derek, the market consider this pattern is never used. 

However Derek said if you consider using reflection API, then it can be very useful when you trying to change the representation of data from one form to the other. 
This example trying to show how you can convert unit from cups/gallons/etc to pints/quarters. etc. 


>> Steps:
1. create an Expression interface, which has the following method declared. : 
	gallons
	quarts
	pints
	cups
	tablespoons    

2. create concrete class of Cups/Gallons/etc. to implement Expression interface. Obviously each concrete class will have different implementation of the abstract method.
3. create class ConversionContext to translate input string from GUI to questions parts and then to be used in the client class. 
4. Create MeasurementConversionClient class to create the conversionContext instance by passing in input string and tokenize it into parts of the questions. 
	the 1st part is the quantity. 
	the 2nd part will be used to determine which concrete class is going to be instantiate. After instance A created, then it will be cast into Expression. 
	the 4th part will be used to get the method name of A; 1st part will be used as the parameter when invoking this method. 
	
>> Reviewed
	on 7/10/2019 for 2nd time. 

	  