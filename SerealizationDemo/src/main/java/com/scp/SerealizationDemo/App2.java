package com.scp.SerealizationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.scp.SerealizationDemo.model.SerializableStudent;

public class App2 {

public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	// If the structure of serializable class is changed after the serialization
	// and then
	// after we try to deserialize the object (using the class with new
	// structure) it will throw the Exception
	
	//First serialize the object and store it in file
	
	String filePath="D:\\swapnil\\Scoopen\\filesUsedInFileHandlingPrograms\\serilaztionClassStructureChange.txt";
	File f =new File(filePath);
	
	
	/*SerializableStud ss= new SerializableStud(20, 10);
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));    	
    oos.writeObject(ss);*/
    
    //Now run the application with code above this line only
    //After running this code comment out the code above this line except File and file path code
    
    //Now change the structure of SerializableStud class lets add one string field named "name"
    //After adding new filed in SerializableStud lets try to deserialize the SerializableStud class
    //from the file in which we have stored it using serialization.
	//REMEMBER TO COMMENT OUT SERIALIZATION CODE BEFORE RUNNING THE DESERIALIZATION CODE
    ObjectInputStream ois= new ObjectInputStream(new FileInputStream(f));
    SerializableStud ss2= (SerializableStud) ois.readObject();
    // THIS LINE WILL THROW EXCEPTION "java.io.InvalidClassException" BECAUSE WE HAVE CHANGED THE STRUCTURE OF CLASS
    //dETAILED EXCEPTION WILL LOOK LIKE : java.io.InvalidClassException: com.scp.SerealizationDemo.SerializableStud; local class incompatible: stream classdesc serialVersionUID = -4114461124736252403, local class serialVersionUID = -2362281411162776838
    
    //TO OVERECOME THIS SITUATION WE HAVE TO SPECIFY THE serialVersionUID FOR THE CLASS AND
    //UPDATE THIS ID WHEN EVER WE DO ANY STRUCTUREL CHANGE TO THAT CLASS 
}
    

}

class SerializableStud implements Serializable {
	
	private static final long serialVersionUID = 5L;
	int rollNo;
	int standard;
	String name;

	public SerializableStud(int rollNo, int standard) {
		this.rollNo = rollNo;
		this.standard = standard;
	}
	
}
