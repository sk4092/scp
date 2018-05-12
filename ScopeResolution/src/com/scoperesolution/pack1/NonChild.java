package com.scoperesolution.pack1;

public class NonChild {

	void displayVariablesInNonChild(){
		/*System.out.println(publicVar);
		System.out.println(privateVar); 
		System.out.println(protectedVar);
		System.out.println(defaultVar);*/
		//non child cannot access any variable without reference of class 
		
		Parent p =new Parent(); // created reference object
		
		System.out.println(p.publicVar);
		//System.out.println(p.privateVar); //non child cannot access private member
		System.out.println(p.protectedVar);
		System.out.println(p.defaultVar);
		
		//non child can access any variable other than private by using object reference 
	}
}
