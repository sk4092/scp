package com.scp.ExceptionHandling;


/*
 *Here in try block Arithmetic exception will occur and control will be passed to finally block
 *But in finally block Array Index Out Of Bound Exception Will occur and the exception from try block is suppressed.
 *ie. ArrayIndexOutOfBoundsException is thrown and ArithmeticException is suppressed. 
 */
public class ExceptionInFinallyBlock {
public static void main(String[] args) {
	try {
		System.out.println("Executing Try Block");
		int x = 10;
		x = x / 0; // Throw ArithmeticException as we have divided and integer value by zero
	} 
	finally{
		//finally block is executed regardless of whether there is exception or not 
		System.out.println("Executing finally block");
		int []x = {10};
		int t=x[1];//Throw ArrayIndexOutOfBoundsException
	}
}
}
