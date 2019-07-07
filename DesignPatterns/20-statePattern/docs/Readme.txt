*********************
* State     pattern *
*********************

http://www.newthinktank.com/2012/10/state-design-pattern-tutorial/

Note:

To allow a object to change behavior depends on current state. 

ATMMachine is the object we talk about. It contains 4 different concrete states and has a current concrete state. 

Concrete states are implementing the same "ATMState" interface, and has a ATMMachine instance passed in through the constructor. 
	The implementation of ATMState interface method, will use the ATMMachine's method to set the correct next current concrete state. 
	The different concrete state implementation of the interface method will determine the behavior of ATMMachine. 
	
ATMMachine has the same set of method defined in ATMState interface, when one of these methods is called, the currentState's corresponding method is called. 

TestATMMachineClient will call ATMMachine's method, according to the current state of ATMMachine, the behavior of the ATMMachine will be different. 
