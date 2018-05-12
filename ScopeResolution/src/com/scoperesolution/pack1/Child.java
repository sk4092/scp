package com.scoperesolution.pack1;


public class Child extends Parent{

	public void displayVariablesInChield(){
		System.out.println(publicVar);
		//System.out.println(privateVar); //child cannot access private member
		System.out.println(protectedVar);
		System.out.println(defaultVar);
	}
}
