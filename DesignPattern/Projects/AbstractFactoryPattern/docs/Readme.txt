Abstract Factory 

1. program entry is the "EnemyShipTest", it declares an abstract EnemyShipBuilding Class, but instantiate it as a concrete one,  UFOEnemyShipBuilding, 

2. In step1 , the client  EnemyShipTest passed a string value to the concrete Building to tell which concrete factory to use. 

3. Inside the Building class, depends on the string value, a local factory is created. 
		And the local factory object is passed to Ship constructor to instantiate the concrete ship. 
		
4. Inside the Building class, an abstract ship is also declared. since the ship has a factory declared inside of it. 
		it can use the factory to build the correct weapon and engine for the ship. 