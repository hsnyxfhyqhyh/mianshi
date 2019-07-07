Decorator Pattern:

To have the additional capability of inheritance but add those functionality at run time. So it more flexible than inheritance.  

http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/ 

1. create a Pizza interface which has getDescription and getCost function.  
2. create a PlainPizza class which implements Pizza interface. 
		It has the base information. 
3. Create a ToppingDecorator class which implements the Pizza interface too. 
		ToppingDecorator is an abstract class, to prevent being used directly.
			It has a property called tempPizza to save the pizza instance passed in, so the values of the pizza instance can be appended to, like description and cost.  
4. TomatorSauce and Mozzarella are concrete class inherited from ToppingDecorator. The overrided implementation of getDescription and getCost can use the property tempPizza and append the value to. 
5. In the PizzaMakerClient code, you can see since everything is implementing the Pizza interface, 
		we can nest the constructor call to have one unique pizza for the customerized instance of customer choice. The final result is still pizza. 
		 