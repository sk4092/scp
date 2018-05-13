package com.scp.ExceptionHandling;

public class TryCatchFinallyDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Executing Try Block");
			int x = 10;
			x = x / 0; // Throw ArithmeticException as we have divided and
						// integer value by zero
		} catch (Exception e) {
			// Handle all type of exception as we are
			// accepting Exception class object as input parameter
			System.out.println("Executing Catch block");
			e.printStackTrace();
		} finally {
			// finally block is executed regardless of whether there is
			// exception or not
			System.out.println("Executing finally block");
		}
	}

}
