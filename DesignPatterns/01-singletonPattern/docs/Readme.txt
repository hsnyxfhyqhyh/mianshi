*********************
* singleton pattern *
*********************
http://www.newthinktank.com/2012/09/singleton-design-pattern-tutorial/

Actually the singleton pattern concept is very easy

1. this is to avoid creating multiple instances of the same object. 
2. So provide a default private constructor, 
3. declare a static instance of the class. 
4. to provide a getInstance static method, if the static instance of step 3 is null, call private constructor to create one; 
	otherwise, return the static instance. 
	
5. The sample provided by Derek here is a little more complicated because he was trying to explain the thread can have impact to the singleton, 


>> Reviewed
	on 7/8/2019