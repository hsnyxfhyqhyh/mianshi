*******************
* Visitor pattern *
*******************

http://www.newthinktank.com/2012/11/visitor-design-pattern-tutorial/

Allows you to add methods to classes of different types without much altering to those classes. 
Two types of interface are allowed here. Visitor and Visitable.
Concrete visitors will have overriden visit method for each different type of Visitable.   
Concrete Visitable class has an accept method to accept visitor of different visitors in the parameter of "Visitor", 
	and in the accept method of Visitable use the passed Visitor's visit(this) function to do the real logic. because different Visitable will have a form of visit method for it. 
	
Steps: 
1. The client will create 2 types visitor concrete instance for tax calculation, non-holiday/holiday, the tax will be different. 
2. The client instantiate different types of Visitable. 
3. For each every Visitor, the client will call visitable's accept(Visitor) function to do business.  