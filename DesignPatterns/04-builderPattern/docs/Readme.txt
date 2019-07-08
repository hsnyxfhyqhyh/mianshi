******************
Builder Pattern: *
******************

http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/

>> NOTE: 
As mentioned in BuilderPattern_1.PNG, this pattern is used when you want to create a product (Robot) made from multiple objects (parts) 
but want the process of objects creation to be independent of the client class

>> Steps: 

1. OldRobotBuilder is the old builder before implementing this pattern, it has all the details of building the parts of a robot that a client needs to build a robot. 
		it has 4 build*** functions to wrap on the set*** of a robot.
2. Derek abstracts the build*** functions to RobotBuilder interface, and this interface can be used directly in the "Director" RobotEngine class as a defined variable, 
	say A (RobotBuilder). 
3. RobotEngine accepts an instance of OldRobotBuilder in the constructor, and assigned the value to A (RobotBuilder)
4. RobotEngine has a method makeRobot, which will use the concrete OldRobotBuilder instance in the format defined by RobotBuilder interface. 
5. Client only need to deal with the Director class RobotEngine, with injection of OldRobotBuilder instance to the Director, 
	then it doesn't care how director is going to build robot. What it needs to do is only to call the makeRobot function, 
	then call getRobot function to get the final product with different parts. 
	
>> Review
	on 7/9/2019 for 3nd time. 