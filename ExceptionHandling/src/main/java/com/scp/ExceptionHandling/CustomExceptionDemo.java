package com.scp.ExceptionHandling;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		try{
			throw new MyException("INVALID DATA");
		}
		catch (MyException e) {
			System.out.println(e);
		}
	}
}

class MyException extends Exception{
	String message;
	public MyException(String message) {
		this.message=message;
	}
	
	public String toString(){ 
		return ("MyException Occurred: "+message) ;
	   }
}
