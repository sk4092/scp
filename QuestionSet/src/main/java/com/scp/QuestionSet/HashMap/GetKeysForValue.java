package com.scp.QuestionSet.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetKeysForValue {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap();
		map.put("CityOne", "Pune");
		map.put("CityTwo", "Satar");
		map.put("CityThree", "Satar");
		map.put("CityFour", "Pune");
		map.put("CityFive", "Satar");
		
		List<String> keys1=findKeysForValueUsingKeySet(map,"Satar");
		System.out.println("Keys Found For Satara: ");
		printList(keys1);
		
		List<String> keys2=findKeysForValueUsingEntrySet(map,"Pune");
		System.out.println("\nKeys Found For Pune: ");
		printList(keys2);
		
	}

	private static void printList(List<String> keys1) {
		for (String key : keys1) {
			System.out.println(key);
		}
	}

	private static List<String> findKeysForValueUsingEntrySet(Map<String, String> map, String value) {
		List<String> foundkeyList = new ArrayList<String>();
		Set<String> keys= map.keySet();
		for (String key : keys) {
			if(map.get(key).equals(value)){
				foundkeyList.add(key);
			}
		}
		return foundkeyList;
	}

	private static List<String> findKeysForValueUsingKeySet(Map<String, String> map, String value) {
		List<String> foundkeyList = new ArrayList<String>();
		Set<Entry<String, String>> keys= map.entrySet();
		for (Entry<String, String> entry : keys) {
			if(entry.getValue().equals(value)){
				foundkeyList.add(entry.getKey());
			}
		}
		return foundkeyList;
	}

}
