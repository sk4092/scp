package com.scp.QuestionSet.ReverseString;

public class ReverseStringCharArray {

	public static void main(String[] args) {
		String s="Swapnil";
		char[] charArray=s.toCharArray();
		for(int i = charArray.length-1;i>=0;i--){
			System.out.print(charArray[i]);
		}
	}
}