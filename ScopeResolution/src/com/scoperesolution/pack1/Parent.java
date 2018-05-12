package com.scoperesolution.pack1;

public class Parent {

	public String publicVar;
	private String privateVar;
	protected String protectedVar;
	String defaultVar;
	
	public static void main(String args){
		
	}
	
	public void displayVariables(){
		System.out.println(publicVar);
		System.out.println(privateVar);
		System.out.println(protectedVar);
		System.out.println(privateVar);
	}
}
