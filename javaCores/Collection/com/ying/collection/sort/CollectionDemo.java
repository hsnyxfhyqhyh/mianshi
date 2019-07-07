package com.ying.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ying.Utility;

/*
 * Source: 
 * 
 * https://www.youtube.com/watch?index=66&edufilter=NULL&list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf&v=NeB7kgiCXTU
 */
public class CollectionDemo {
	
	
	public static void main(String[] args) {
		
			Utility.printExplanationLine("Sorting by default integer implementation of comparable");
			
		sortByComparableImplementation();
		
			Utility.printBlankLine();
			Utility.printExplanationLine("Sorting by Comparator");
		sortByLastDigit();
		
			Utility.printBlankLine();
			Utility.printExplanationLine("Sorting by Comparator by lambda because comparator is functional interface");
		sortByLastDigitWithLambda();
	}
	
	//This method is sorting the arraylist by the number order, which is the implementation of comparable interface by Integer. 
	private static void sortByComparableImplementation() {
		List<Integer> values= new ArrayList<>(); 
		
		values.add(404);
		values.add(908); 
		values.add(639); 
		values.add(265); 
		
		
		Collections.sort(values); 
		
		for (Integer o: values) {
			System.out.println(o);
		}
	}
	
	
	//This method is sorting the arraylist by the last digit, which will use the 2nd parameter of sort method (Collections)
	private static void sortByLastDigit() {
		List<Integer> values= new ArrayList<>(); 
		
		values.add(404);
		values.add(908); 
		values.add(639); 
		values.add(265); 
		
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				return i%10> j %10? 1: -1; 
			}
			
		}; 
		
		Collections.sort(values, c); 
		
		for (Integer o: values) {
			System.out.println(o);
		}
	}
	
	
	//This method is sorting the arraylist by the last digit, which will use the 2nd parameter of sort method (Collections)
	private static void sortByLastDigitWithLambda() {
		List<Integer> values= new ArrayList<>(); 
		
		values.add(404);
		values.add(908); 
		values.add(639); 
		values.add(265); 

		//Comparator is a functional interface, so everything can come as single line. 
//		Comparator<Integer> c = (i, j) -> i%10> j %10? 1: -1; 
//		Collections.sort(values, c); 
		Collections.sort(values, (i, j) -> i%10> j %10? 1: -1); 
				
		for (Integer o: values) {
			System.out.println(o);
		}
	}
}
