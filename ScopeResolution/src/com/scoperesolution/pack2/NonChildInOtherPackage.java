package com.scoperesolution.pack2;

import com.scoperesolution.pack1.Parent;

public class NonChildInOtherPackage {

	void displayVariables(){
		//System.out.println(publicVar);  
		//System.out.println(privateVar); 
		//System.out.println(protectedVar);
		//System.out.println(defaultVar); 
		//non child in other package cannot access any variable in without object reference
		
		Parent p =new Parent(); // created reference object
		
		System.out.println(p.publicVar);
		//System.out.println(p.privateVar); 
		//System.out.println(p.protectedVar);
		//System.out.println(p.defaultVar);
		
		// non-child in other package can access  only public variable by using object reference
		
		
	}
}
