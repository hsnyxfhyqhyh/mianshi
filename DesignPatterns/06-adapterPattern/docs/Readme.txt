Adapter Pattern:

http://www.newthinktank.com/2012/09/adapter-design-pattern-tutorial/

1. Create an interface called EnemyAttacker, which defines all Target methods.  
2. Create a class "EnemyTank" , which is a direct implementation of EnemyAttacker. 
3. Create a class EnemyRobot , which has  different methods defined in the class. 
	so our task is to make an adapter which works in between  EnemyAttacker and EnemyRobot. 
	
4. Create a class called EnemyRobotAdapter which implements EnemyAttacker, but has a constructor to pass in an object of EnmeyRobot
	also we need to implement the methods defined in the interface. So we can in the implementation of methods, we use the EnemyRobot instance to call the real method. 
	
5. Client: TestEnemyAttackersClient. 
	You can see from the code, an instance of EnemyRobot was created directly and passed into the Adapter constructor, 