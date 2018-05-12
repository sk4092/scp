package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindKeyByValue {

	public static void main(String a[]){
		// TODO Auto-generated method stub

		Map<String,Integer> hMap = new HashMap();
		hMap.put("one First", 1);
		hMap.put("one Second", 1);
		hMap.put("Two First", 2);
		hMap.put("Two Second", 2);
		hMap.put("Three", 3);
		
		System.out.println("Current Values in HashMap : "+hMap);
				
		List<String> obtainedKeyList = GetKeysFromMapForValue(hMap,2);
		if(obtainedKeyList.size()>0){
			System.out.println("Key found for given value"+obtainedKeyList);
		}
		else{
			System.out.println("No key found for given value");
		}
	}

	private static List<String> GetKeysFromMapForValue(Map<String, Integer> hMap, int value) {
		Set<String> keySet= hMap.keySet();
		List<String> foundKeys=new ArrayList<>();
		for (String key : keySet) {
			Integer val=hMap.get(key);
			if(val==value){
				foundKeys.add(key);
			}
		}
		return foundKeys;
	}
	
	
	
}
