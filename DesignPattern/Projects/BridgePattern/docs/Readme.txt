Bridge Pattern:

http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/

NOTE:
	The RemoteButton class has been renamed to RemoteControl to make sense. 

1. With the Bridge Design Pattern you create 2 layers of abstraction

2. In this example I'll have an abstract class "EntertainmentDevice" representing different types of devices. 

3. Also an abstract class that will represent different types of remote controls, "RemoteControl". 
	RemoteControl has a constructor to accept the abstract device, and then bind the method to the device's corresponding method.  

4. TV Device and DVD Device are concrete implementation of "EntertainmentDevice", which has the abstract methods (defined in EntertainmentDevice) implemented. 

5. DVDRemote, TVRemoteMute and TVRemotePause are all concrete implementation of the RemoteControl abstract class



