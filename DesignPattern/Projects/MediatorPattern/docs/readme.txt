********************
* Mediator pattern *
********************

http://www.newthinktank.com/2012/10/mediator-design-pattern-tutorial/

Notes: 
It is used to handle communication between related objects (TERM: colleagues). 
The colleagues doesn't need to know each other. 
Basically client class create an instance of the Mediator and passed it into the colleagues construction, 
	The mediator instance can be used in the constructor to add the colleague itself to Mediator instance. 
	
Whenever the client application calls the colleague's function to do something, the mediator is used to do the real operation. 

Steps: 
1. Create Mediator interface and StockMediator concrete class.  
2. StockMediator has an arraylist of Colleagues and addtoColleague function to be called from colleague instance. 
3. StockMediator has the same communication method the colleagues are going to have, so the real call can be passed from colleague to mediator
4. Colleague has a constructor to pass in the mediator as parameter, and colleague itself can be added to Mediator's colleagues arraylist. 
5. Client instantiate the mediator's instance then pass it to the Colleague's constructor. 
	client then use colleague's communication method to do something and the mediator behind of the scene will be used to execute the operation .
 