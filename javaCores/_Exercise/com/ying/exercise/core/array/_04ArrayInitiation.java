package com.ying.exercise.core.array;

public class _04ArrayInitiation {

	public static void main(String[] args) {
		// TODO
		/*
		 *  please refer to TODO in the 
		 *  	demo1D
		 *  	deom2D
		 *  
		 *  
		 */
		
		demo1D();
		demo2D();
	}
	
	public static void demo1D () {
		// TODO
		/*
		 * 	https://www.youtube.com/watch?index=24&list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf&edufilter=NULL&v=fuDNAKStpq0&frags=wn
		 * 
		 *  Initiate an int array with element, 5, 6, 8, 9 10
		 *  	* declaration of the array variable with values in one line
		 *  	* declare the array variable with initialize size. 
		 *  		set values for each element. 
		 *  print the 3rd element. 
		 */
		
		int[] arr = {5, 6, 8, 9, 10}; 
		System.out.println(arr[2]);

		int[] arr1 = new int[5]; 
		arr1 [2] = 8; 
		System.out.println(arr1[2]);
		
		//[] can be before variable name or after.
		int arr2[] = new int[5]; 
		arr2 [2] = 8; 
		System.out.println(arr2[2]);
	}
	
	public static void demo2D () {
		// TODO
		/*
		 *  initialize 3 1d int array with values, 
		 *  declare 2d int array by using the 1d int array as element. 
		 *  print 2d array's element at 3rd row , 2nd column
		 *  
		 *  print 2d jaggard array's every element. 
		 */
		
		int[] a = {3, 4, 6 , 8}; 
		int[] b = {4, 6 , 10};
		int[] c = {3, 5 , 7, 10};
		
		int[][] d = {a, b, c}; 
		
		System.out.println(d[2][1]);
		
		System.out.println(d[2]);
		
		for (int i =0; i<d.length; i++) {
			for (int j=0; j< d[i].length ; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
			
	}

}
