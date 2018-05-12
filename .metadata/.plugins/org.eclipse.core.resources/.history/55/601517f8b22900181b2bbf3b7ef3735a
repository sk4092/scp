package com.scoperesolution.pack1;


public class Child extends Parent{

	public static void displayVariablesStaticInChield(){
		//child cannot access instance variable in static method without reference 
		//System.out.println(instanceVar);
		System.out.println(staticVar); //child can access static member in static scope
		
		//child can access instance variable in static method with reference
		Parent p=new Parent();
		System.out.println(p.instanceVar);
	}
	
	public void displayVariablesInChield(){
		//child can access static and instance variables of parent in instance method
		System.out.println(instanceVar); 
		System.out.println(staticVar); 
	}
}
