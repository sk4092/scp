package com.scp.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Note:
 * 1. Only one catch block is executed at a time because once the control is passed to any 
 *    of the catch block it will NOT transfered back to try block
 * 2. The sequence of catch block also have rule that we need to write specialized catch block prior to the generalized once
 *    ie. we can't write catch(Exception e) prior to catch (FileNotFoundException e) because the exception will then be handled in 
 *    catch(Exception e) and the other catch blocks will be unreachable code
 *    Java will give compile time error saying Unreachable catch block
*/
public class MultipleCatchDemo {
	public static void main(String[] args) {
		
		try {
			System.out.println("Executing Try block");
			File file=new File("D:/xyzabc.txt");
			FileReader reader=new FileReader(file);//This line will throw FileNotFoundException if the file provided dosen't found
		} 
		catch (ArithmeticException e) {
			//This block will be executed only if there is Arithmetic Exception occurs in try block
			System.out.println("Executing catch block for Arithmetic Exception");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			//This block will be executed only if there is FileNotFound Exception occurs in try block
			System.out.println("Executing catch block for FileNotFound Exception");
			e.printStackTrace();
		}catch (Exception e) {
			// Any other exception are handled in this block
			System.out.println("Executing catch block for Exception");
			e.printStackTrace();
		}
		
	}
}
