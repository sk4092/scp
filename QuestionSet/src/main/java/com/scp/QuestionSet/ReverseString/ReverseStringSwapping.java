package com.scp.QuestionSet.ReverseString;

public class ReverseStringSwapping {
	public static void main(String[] args) {
		String s="Swapnil";
		char [] chars=s.toCharArray();
		
		for(int left=0,right=chars.length-1;right>left;left++,right--){
			 char temp = chars[left];
			 chars[left] = chars[right];
			 chars[right]=temp;
		}
		for (char c : chars) {
			System.out.print(c);
		}
		
	}
}
