package itteration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.plaf.SliderUI;

import bean.ComparableStudent;
import bean.Student;

/*
 * These are the legacy in collection framework  
 *Dictionary
 *HashTable
 *Properties
 *Stack
 *Vector
 * 
 * 
 * */
public class AllIterator {
	
	public static void main(String[] args) {
		
		Student s1=new Student(1, "Swapnil", "Pune");
		Student s2=new Student(2, "Sahil", "Karad");
		Student s3=new Student(3, "Saket", "Mumbai");
		
		Properties properties=new Properties();
		properties.put(s1, "Student 1");
		properties.put(s2, "Student 2");
		properties.put(s3, "Student 3");
		System.out.println(properties);
		Set<Object>propertiesKeySet= properties.keySet();
		//iteratorStudents(propertiesKeySet);
		
		//Array List
		List<Student> sList = new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		System.out.println("\nArray List :-");
		iteratorStudents(sList);
		
		
		//Vector
		Vector<Student> v =new Vector<>();
		v.add(s1);
		v.add(s2);
		v.add(s3);
		System.out.println("\nVector :-");
		iteratorStudents(v);
		
		//SET
		Set<Student> studentHashSet = new HashSet<>();
		studentHashSet.add(s1);
		studentHashSet.add(s2);
		studentHashSet.add(s3);
		System.out.println("\nHashSet :-");
		iteratorStudents(studentHashSet);
		
		//LinkedHashSet
		LinkedHashSet<Student> studentLinkedHashSet = new LinkedHashSet<>();
		studentLinkedHashSet.add(s1);
		studentLinkedHashSet.add(s2);
		studentLinkedHashSet.add(s3);
		System.out.println("\nLinkedHashSet :-");
		//iteratorStudents(studentLinkedHashSet);
		
		//Tree Set
		/*ComparableStudent cs1=new ComparableStudent(1, "Swapnil", "Pune");
		ComparableStudent cs2=new ComparableStudent(2, "Sahil", "Karad");
		ComparableStudent cs3=new ComparableStudent(3, "Saket", "Mumbai");
		
		SortedSet<ComparableStudent> studentSortedSet = new TreeSet<ComparableStudent>();
		studentSortedSet.add(cs1);
		studentSortedSet.add(cs2);
		studentSortedSet.add(cs3);
		System.out.println("\nSortedSet->TreeSet :-");
		iteratorComparableStudents(studentSortedSet);
		*/
		
		//Priority Queue
		/*Queue<Student> studentQueue=new PriorityQueue<>();
		studentQueue.add(s1);
		studentQueue.add(s2);
		studentQueue.add(s3);
		System.out.println("\nQueue->PriorityQueue :-");
		iteratorStudents(studentQueue);
		*/
		
		
		
		//HashMap
		HashMap<Student, String> studentHashMap = new HashMap<>();
		studentHashMap.put(s1, "Student1");
		studentHashMap.put(s2, "Student2");
		studentHashMap.put(s3, "Student3");
		Set<Student> keySetOfStudentHashMap = studentHashMap.keySet();
		System.out.println("\nHashMap->KeySet :-");
		iteratorStudents(keySetOfStudentHashMap);
				
		LinkedHashMap<Student, String> linkedHashMapOfStudent = new LinkedHashMap<>();
		linkedHashMapOfStudent.put(s1,"Student1");
		linkedHashMapOfStudent.put(s2,"Student2");
		linkedHashMapOfStudent.put(s3,"Student3");
		Set<Student> keySetOfStudentLinkedHashMap = linkedHashMapOfStudent.keySet();
		System.out.println("\nLinkedHashMap->KeySet :-");
		iteratorStudents(keySetOfStudentLinkedHashMap);
		
		
		
		
		
		
	}
	
	private static void iteratorStudents(Collection<Student> collection){
		Iterator<Student> studentIterator=collection.iterator();
		while(studentIterator.hasNext()){
			System.out.println(studentIterator.next());
		}
	}
	
	private static void iteratorComparableStudents(Collection<ComparableStudent> collection){
		Iterator<ComparableStudent> studentIterator=collection.iterator();
		while(studentIterator.hasNext()){
			System.out.println(studentIterator.next());
		}
	}

}
