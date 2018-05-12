package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> l =new ArrayList<Integer>();
		l.add(10);
		l.add(15);l.add(45);
		l.add(20);
		
		l.add(10000);
		
		
		
		l.sort(null);
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()); 
		}
		
	}
}
