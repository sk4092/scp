package com.scp.StaticFinal.staticdemo;

import java.awt.datatransfer.StringSelection;

public class StaticDemo extends Test{

	/*public void display(){                     //can not override static method
		System.out.println("Static of child");
	}*/
	
	public void show(){                          //Overridden method
		System.out.println("Member of child");
	}
	
	public static void main(String[] args) {
		Test test= new StaticDemo();
		test.show();
		test.display();
		
	}
	
}

class Test{
	public static void display(){
		System.out.println("Static of parent");
	}
	
	public void show(){
		System.out.println("Member of parent");
	}
}
