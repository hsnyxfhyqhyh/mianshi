package com.ying.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ying.Utility;

public class SortDemo {
	
	
	public static void main(String[] args) {
		Utility.printExplanationLine("In this example, class 'Student' implements Comparable interface. "
							+ "	\n You can see how the sorting logic is implemented within compareTo method ");
		
		Utility.printBlankLine(); 
		
		demo(); 
		
	}
	
	/*
	 * real demo
	 */
	private static void demo() {
		List<Student> students = new ArrayList<Student>(); 
		
		students.add(new Student("Mahesh", 55));
		students.add(new Student("Sony", 64));
		students.add(new Student("Larry", 25));
		students.add(new Student("Joseph", 36));
		
		Utility.printExplanationLine ("Sort by the the length of name"); 
		Collections.sort(students);
		
		for (Student s : students) {
			System.out.println(s);
		}
	}
	
}

/*
 * class that implements the comparable interface. 
 */
class Student implements Comparable <Student>
{
	int score; 
	String name;
	
	public Student(String name, int score) {
		super (); 
		this.score = score; 
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		return name.length() > s.name.length()?1:-1;
	}
	
}
