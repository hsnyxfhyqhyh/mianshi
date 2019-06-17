Facade Pattern:

http://www.newthinktank.com/2012/09/facade-design-pattern-tutorial/

This is a very simple pattern, you probably used it all the time but don't know it. 

Basically you want to create a simple interface to deal with complicated logics. 
For example if you want to withdrawal fund from an account, there is a lot of logic check to handle such as: 
	account active check
	security check. 
	enough fund check.
		allow withdrawal fund only when all 3 conditions meet. 
		

BankAccountFacade is such an interface to hide all these kind of complicated logic, and expose 2 simple method only, 
	WithdrawalFund
	Deposite cash.    