package com.ying.inheritance.superKeyword;

class A
{
	public A() {
		System.out.println("in A");
	}
	
	public A(int i) {
		System.out.println("in A int");
	}
}

class B  extends A
{
	public B() {
		//Assume there is a call to super(); 
		System.out.println("in B");
	}
	
	public B(int i) {
		//Assume there is a call to super();  /*to the default constructor of super class*/
		
		//compare to C's consctructor and to see the behavior.  
		
		System.out.println("in B int");	
	}
	
}

// C is created for comparision to B. 
class C  extends A
{
	public C() {
		//Assume there is a call to super(); 
		System.out.println("in C");
	}
	
	public C(int i) {
		//Can change the super behavior to call a different constructor of super class 
		super (i); 
		
		System.out.println("in C int");	
	}
	
}


public class SuperDemo {
	public static void main(String[] args) {
		A obj1 = new A(); 
		//print 'in A'
		System.out.println("\n");
		
		B obj2 = new B(); 
		//print 'in A' \n 'in B', it calls the super class constructor and its own constructor
		
		System.out.println("\n");

		//This will still call the constructor of A with no parameter as default behavior.  
		B obj3 = new B(5); 
		
		System.out.println("\n");
		C obj4 = new C(5);

	}
}
