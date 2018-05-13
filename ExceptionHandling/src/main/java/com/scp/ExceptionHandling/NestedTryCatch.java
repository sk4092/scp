package com.scp.ExceptionHandling;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		try{
			System.out.println("Executing outer try block");
			try{
				System.out.println("Executing inner try block");
				int []x={1};
				x[1]=10;//Throws ArrayIndexOutOfBoundException				
			}catch (Exception e) {
				System.out.println("Executing inner catch block");
				e.printStackTrace();
			}
			System.out.println("Continue Executing outer try block after executing inner try catch");
			Class.forName("xyz");//Throws ClassNotFoundException if the class provided was not found
		}
		catch (Exception e) {
			System.out.println("Executing outer catch block");
			e.printStackTrace();
		}
	}

}
