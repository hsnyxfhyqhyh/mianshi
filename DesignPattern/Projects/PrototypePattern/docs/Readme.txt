prototype Pattern:

http://www.newthinktank.com/2012/09/prototype-design-pattern-tutorial/

1. create an interface Animal as cloneable, declare a function in the interface as makeCopy.  
2. create a concrete class as Sheep to implement Animal, and define the detail of making a clone copy
3. According to Derek, the CloneFactory is not really needed, but he has this preference. 
	So the factory has a method to getClone and accept the Animal type as parameter, which means the client of this factory needs a Animal instance created before this method call. 
		  the getClone will use the parameter passed in to make an identical copy of instance and return it. 
4. TestCloningClient calls the CloneFactory to getClone of a particular Animal.

   