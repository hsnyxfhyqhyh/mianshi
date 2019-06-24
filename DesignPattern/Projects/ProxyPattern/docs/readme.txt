******************
* Proxy Pattern: *
******************

http://www.newthinktank.com/2012/10/proxy-design-pattern-tutorial/


>> Note: 

The usage of this pattern is only to limit the access to another class for SECURITY reason. 

In this example, the main classes are: 
	TestATMMachine.java
	ATMMachine.java
	ATMProxy.java
	GetATMData.java
	
This example is based on the example of State Pattern. However the ATMState is irrelevent to Proxy Pattern. 

You can see there is a lot of more functions defined in ATMMachine than ATMProxy, 
	however Derek created an interface "GetATMData", and made ATMMachine and ATMProxy to implement GetATMData. 
	
In client application, TestATMMachine, at the end of the main function, Derek created an instance of GetATMData and assigned an object based on ATMProxy. 

Then you can see only the method defined in GetATMState is available to the client, everything else is hidden. 

In the implementation of the method in ATMProxy, 
		actually every method has an real ATMMachine instance created and used to call the corresponding method defined in ATMMachine
		

		
ESB has the similar concept of doing things. 
