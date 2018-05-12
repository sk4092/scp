package com.scoperesolution.pack1;

public class NonChild {

	void displayVariables(){
		
		Parent p =new Parent(); // created reference object
		//System.out.println(instanceVar);
		//System.out.println(staticVar); 
		System.out.println(p.instanceVar);
		System.out.println(p.staticVar); 
		System.out.println(Parent.staticVar);
		
		//non child cannot access instance as well as static variables  without reference in instance method
		//non child can access instance as well as static variables with reference in instance method
	}
	
	static void displayVariablesStatic(){
		
		Parent p =new Parent(); // created reference object
		//System.out.println(instanceVar);
		//System.out.println(staticVar); 
		System.out.println(p.instanceVar);
		System.out.println(p.staticVar); 
		System.out.println(Parent.staticVar);
		
		//non child cannot access instance as well as static variables  without reference in static method
		//non child can access instance as well as static variables with reference in static method
	}
}
