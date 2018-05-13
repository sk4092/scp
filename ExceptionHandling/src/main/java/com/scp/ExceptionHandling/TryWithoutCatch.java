package com.scp.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * In this example the resource is BufferReader object as the class implements 
 * the interface java.lang.AutoCloseable and it will be closed whether the try block 
 * executes successfully or not which means that you won't have to write br.close() explicitly.
 * 
 * */
public class TryWithoutCatch {

	public static void main(String[] args) throws IOException {
		System.out.println(readFirstLineFromFile("D:/temp.txt"));
	}

	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br =
		               new BufferedReader(new FileReader(path))) {
		    return br.readLine();
		}
	}
}
