package com.scp.QuestionSet.HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHasMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(10, "Swapnil");
		hMap.put(13, "Sahil");
		hMap.put(15, "Swapnil");
		hMap.put(17, "Amol");

		// Iterate Using keySet
		Set<Integer> setOfKeys = hMap.keySet();
		Iterator<Integer> itr = setOfKeys.iterator();
		System.out.println("Iterating Using KeySet");
		while (itr.hasNext()) {
			System.out.println(hMap.get(itr.next()));
		}

		// using values
		Collection<String> values = hMap.values();
		System.out.println("\nIterating Using Values");
		for (String string : values) {
			System.out.println(string);
		}

		// using EntrySet
		Iterator<Entry<Integer, String>> itr2 = hMap.entrySet().iterator();
		System.out.println("\nIterating Using EntrySet");
		while (itr2.hasNext()) {
			Entry<Integer, String> entry = itr2.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// using for each loop
		System.out.println("\nIterating Using ForEach");
		for (Entry<Integer, String> entry : hMap.entrySet())
			System.out.println("Key: " + entry.getKey() + "And Value: " + entry.getValue());

		
		// using for each without key set AVAILABLE IN JAVA 1.8
		//System.out.println("\nIterating Using ForEach");
		/*
		 * hMap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = "
		 * + v));
		 */

	}

}
