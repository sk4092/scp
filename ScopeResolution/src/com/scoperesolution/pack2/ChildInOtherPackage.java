package com.scoperesolution.pack2;

import com.scoperesolution.pack1.Parent;

public class ChildInOtherPackage extends Parent {
	
	public void displayVariables(){
		System.out.println(publicVar);  
		//System.out.println(privateVar); child in other package can not access private variable
		System.out.println(protectedVar);
		//System.out.println(defaultVar); child in other package  can not access default variables
		
		Parent p =new Parent(); // created reference object
		
		System.out.println(p.publicVar);
		//System.out.println(p.privateVar); //non child cannot access private member
		//System.out.println(p.protectedVar);
		//System.out.println(p.defaultVar);
		
		// child in other package can access  only public variable by using object reference
		
		
	}
}
