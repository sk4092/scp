package com.scp.QuestionSet.ReverseString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringArrayList {
	public static void main(String[] args) {
		String s="Swapnil Kumbhar";
		char [] chars=s.toCharArray();
		List<Character> charList=new ArrayList();
		for (char character : chars) {
			charList.add(character);
		}
		
		Collections.reverse(charList);
		Iterator<Character> itr = charList.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
		}
	}
}