package com.scoperesolution.pack1;

public class Parent {

	public static String staticVar;
	public String instanceVar;
		
	public static void main(String args){
		Parent p= new Parent();
		p.displayVariables();
		System.out.println(staticVar);
		System.out.println(p.instanceVar);
		
	}
	
	public void displayVariables(){
		System.out.println(staticVar);
		System.out.println(instanceVar);
	}
}
