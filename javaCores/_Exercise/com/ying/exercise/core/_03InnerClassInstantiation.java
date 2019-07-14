package com.ying.exercise.core;

public class _03InnerClassInstantiation {

	public static void main(String[] args) {
		Outer obj  = new Outer(); 
		
		Outer.Inner b = obj.new Inner(); 
		
		b.display();
	}

}


//TODO
/*	https://www.youtube.com/watch?index=22&list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf&edufilter=NULL&v=iqp7NQCN2ck&frags=wn
 * 
 * 
 * Create an outclass Outer,
 * Create an inner class Inner inside Outer. 
 * 		declare a public method display inside Inner. 
 * from the _03InnerClassInstantiation, create an instance, a, of the Outer
 * Use a to create an instance of the inner, b, ; 
 * 	then use b to call Inner's method display.   
 */

class Outer {
	
	
	class Inner {
		public void display() {
			System.out.println("in inner display");
		}
	}
	
}
