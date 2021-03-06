package DuplicateValueInSet;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DuplicateValueInSet {
	public static void main(String[] args) {
		HashSet<A> hashSet = new HashSet();
		A a=new A(10);
		System.out.println(hashSet.add(a));
		System.out.println(hashSet.add(a));
		System.out.println(hashSet.add(a));
		
		System.out.println(hashSet.size());
		
		/* - HashSet is allowing duplicate elements here because in the background there HashSet used HashMap to store elements
		 * - HashMap compares the elements using hashCode of key of the elements passed to it, if the hash code of the existing 
		 *   key matches the new key (ie. key exist in HashMap) it will replace the value of the key with new value and returns 
		 *   the existing value, if key is already dosen't exist in hash map it will add new entry and return null
		 * - Then add() method of set check if the return value is null or not, if it is null then retun true otherwise retun false 
		 * - Here we are overriding the hashCode() in class A, and returning the random number as hash code thats why we are able to
		 *   add duplicate elements in HashSet. 
		 * 
		 * */ 
		
	}
}

class A {

	int x;

	A(int x) {
		this.x = x;
	}

	@Override
	public int hashCode() {
		Calendar calendar=Calendar.getInstance();
		long x=calendar.getTimeInMillis();
		Random rand = new Random();
		int n = (int) (rand.nextInt(50000) + x);
		return n;
	}
}
