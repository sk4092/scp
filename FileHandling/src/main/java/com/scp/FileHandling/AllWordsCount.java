package com.scp.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class AllWordsCount {
	
	public static void main(String[] args) throws IOException {
		File file=new File("D:/temp.txt");
		FileReader reader=new FileReader(file);
		BufferedReader bufferedReader= new BufferedReader(reader);
		
		HashSet<String> hSet = new HashSet<String>();
		HashMap<String, Integer> wordsMap=new HashMap<String, Integer>(); 
		String line=null;
		while((line = bufferedReader.readLine()) != null){
			/*String lineWithoutComa = line.replace(",", "");
			line = line.replace("(", "");
			line = line.replace(")", "");
			line = line.replace(".", "");*/
			
			String []wordArray=line.split(" ");
			for (String string : wordArray) {
				if(hSet.add(string)){
					wordsMap.put(string, 1);
				}
				else{
				int count =	wordsMap.get(string);
				wordsMap.put(string, count+1);
				}
			}
		}
		
		Iterator<Entry<String, Integer>> itr = wordsMap.entrySet().iterator();
		System.out.println("\nIterating Using EntrySet");
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println("Word: " + entry.getKey() + " ==> Count: " + entry.getValue());
		}
	}

}
