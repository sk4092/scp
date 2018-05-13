package com.scp.ExceptionHandling;

public class TryCatchDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Executing Try Block");
			int x=10;
			x=x/0;//Throw ArithmeticException as we have divided and integer value by zero
		} catch (Exception e) {//Handle all type of exception
			System.out.println("Executing Catch block");
			e.printStackTrace();
		}
	}
}
