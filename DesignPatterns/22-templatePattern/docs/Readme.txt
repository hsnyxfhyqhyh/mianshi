Template Method Pattern:

http://www.newthinktank.com/2012/10/template-method-design-pattern-tutorial/

1. Think about a situation of the hoagie shop, the steps to make hoagie is pretty much determined,
	cut a bun
	add meat, 
	add cheese, 
	add condiment
	add vegetables. 
	wrap the hoagie. 

	Then you find out the italian hoagie and veggie hoagie are a little different, but over all the steps to make the hoagie are very similar. 
	
2. You can use Template method pattern to handle this kind of situation. In an abstract class define a final template method which contains the steps to make the hoagie. 

3. The steps can be abstract method defined and they will be used in the template method. 

4. Different Hoagie class will have the abstract method implemented differently.  

5. The client program will make an instance of the concrete class and then call the abstract class's template method through the concrete class instance. 

6. The Class Load of JDK works the same way. 

