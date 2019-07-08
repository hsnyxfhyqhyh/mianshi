**********************
* Abstract Factory   *
**********************
http://www.newthinktank.com/2012/09/abstract-factory-design-pattern/


1. program entry is the "Client", it declares an abstract EnemyShipBuilding Class, but instantiate it as a concrete one,  UFOEnemyShipBuilding,

2. Client calls the concrete building's orderShip method with type of ship it wants as parameter, return object is an abstract ship. 
	The first step inside the ordership method will call the abstract method "makeEnemyShip" defined in abstract building interface, 
		since it is implemented in concrete building-UFOEnemyShipBuilding, then this method will be called.    
		"makeEnemyShip" determines the factory based on the ship it requested, then create a concrete ship object with the concrete factory as a local variable. 
		
	The 2nd step inside the ordership method will used the returned abstract ship object to make a ship, factory is built in. 
		the ship object can use the factory to add gun and engine. 
		

