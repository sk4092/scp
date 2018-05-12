package com.scp.QuestionSet.HashMap;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DuplicateKeyInHashMap {
	public static void main(String[] args) {
		HashMap<A,String> hashMap = new HashMap();
		A a = new A(10);
		System.out.println(hashMap.put(a,"Swapnil"));
		System.out.println(hashMap.put(a,"Sahil"));
		System.out.println(hashMap.put(a,"Swapnil"));

		System.out.println(hashMap.size());


		/* 
		 * - HashMap compares the elements using hashCode of key of the elements passed to it, if the hash code of the existing 
		 *   key matches the new key (ie. key exist in HashMap) it will replace the value of the key with new value and returns 
		 *   the existing value, if key is already dosen't exist in hash map it will add new entry and return null
		 * - Here we are overriding the hashCode() in class A, and returning the random number as hash code thats why we are able to
		 *   add duplicate elements in HashMap. 
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
		Calendar calendar = Calendar.getInstance();
		long x = calendar.getTimeInMillis();
		Random rand = new Random();
		int n = (int) (rand.nextInt(50000) + x);
		return n;
	}
}
