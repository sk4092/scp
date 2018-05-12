package maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ValuesMethodDemo {

	public static void main(String[] args) {

		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		
		//HashMap
		HashMap<Student, String> studentHashMap = new HashMap<>();
		studentHashMap.put(s1, "Student1");
		studentHashMap.put(s2, "Student2");
		studentHashMap.put(s3, "Student2");
		
		Collection<String> names = studentHashMap.values();
		for (String string : names) {
			System.out.println(string);
		}
		
		Collections.synchronizedCollection(names);
	}
}

class Student{
	
}