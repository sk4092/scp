package com.scp.LombokDemo;

import com.scp.LombokDemo.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student student=new Student(10,"Swapnil");
    	
    	String s = student.getName(); 
    	int rno = student.getRollNo();
    	student.setName("sahil");
    	System.out.println(""+s+""+rno);
        
    }
}
