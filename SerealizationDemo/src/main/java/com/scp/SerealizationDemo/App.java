package com.scp.SerealizationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.scp.SerealizationDemo.model.*;

/**
 * Swapnil
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        //private fields
    	String path="D:\\swapnil\\Scoopen\\filesUsedInFileHandlingPrograms\\serilaztionNormalFields.txt";
    	SerializableStudent ss= new SerializableStudent(20, 10);
    	SerializableStudent ss2 = (SerializableStudent) readAndWriteObject(path,ss);
        System.out.println("private fields :"+ss2);
        
        //one transient Field
        String path2="D:\\swapnil\\Scoopen\\filesUsedInFileHandlingPrograms\\serilaztionTraisientFields.txt";
        SeriaziableStudentWithTransient sst=new SeriaziableStudentWithTransient(20, 10);
        SeriaziableStudentWithTransient sst2 = (SeriaziableStudentWithTransient) readAndWriteObject(path2,sst);
        System.out.println("One Transient Field "+sst2);
        
        //one transient static Field
        String path3="D:\\swapnil\\Scoopen\\filesUsedInFileHandlingPrograms\\serilaztionTraisientStaticFields.txt";
        SeriaziableStudentWithTransientStatic ssts= new SeriaziableStudentWithTransientStatic(20, 10);
        SeriaziableStudentWithTransientStatic ssts2=(SeriaziableStudentWithTransientStatic) readAndWriteObject(path3,ssts);
        System.out.println("One Transient Static Field "+ssts2);
        
        
        //non Serializable class
        String path4="D:\\swapnil\\Scoopen\\filesUsedInFileHandlingPrograms\\serilaztionNonSerializableClass.txt";
        Student s= new Student(20, 10);
        Student s2=(Student) readAndWriteObject(path4,s);//throws Error java.io.NotSerializableException as 
        												 //class Student don't implement Serializable interface 
   
        
        
    }
    
    private static Object readAndWriteObject(String filePath,Object o) throws FileNotFoundException, IOException, ClassNotFoundException{
    	File f =new File(filePath);
    	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));    	
        oos.writeObject(o);
        
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
        return ois.readObject();
    }
}
