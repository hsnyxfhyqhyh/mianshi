**********************
* prototype Pattern: *
**********************

http://www.newthinktank.com/2012/09/prototype-design-pattern-tutorial/

>> Note: 
To create new objects by cloning old object in run time. This can reduce the subclass creation, 
and allows for adding of any subclass instance of a known super class at run time. 

>> Steps: 

1. create an interface Animal as cloneable, declare a function in the interface as makeCopy.  
2. create a concrete class as Sheep to implement Animal, and define the detail of making a clone copy
3. According to Derek, the CloneFactory is not really needed, but he has this preference. 
	So the factory has a method to getClone and accept the Animal type as parameter, which means the client of this factory needs a Animal instance created before this method call. 
		  the getClone will use the parameter passed in to make an identical copy of instance and return it. 
4. TestCloningClient calls the CloneFactory to getClone of a particular Animal.

>> Reviewed
	on 6/22/2019 for the 2nd Time. 