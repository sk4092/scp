package com.scp.QuestionSet.ImmutableClass.model;

import java.lang.reflect.Constructor;


public class Test {
	public static void main(String[] args) {
		Student s=Student.getStudent();
		System.out.println(s);
		
		Address a=Address.getAddress();
		
			/*Constructor[] x=a.getClass().getConstructors();
			for (Constructor c : x) {
				c.setAccessible(true);
			}
			 
			* //By using this code of reflection mechanism we can access the private constructors
			*
			*/ 
			
			
	}
}
