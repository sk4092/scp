package com.scp.QuestionSet.ReverseString;

public class ReverseStringStringBuilder {
	public static void main(String[] args) {

		String s="Swapnil";
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(s);
		
		stringBuilder.reverse();
		System.out.println(stringBuilder);
	}
}
