package com.scp.QuestionSet.DigitInString;

public class SingleDigitsSumInString {
	public static void main(String[] args) {
		String str = "Swapnil@123Kumbhar";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 48 && c <= 57) {
				System.out.println("Number Found: " + c);
				sum = sum + Character.getNumericValue(c);
				/*
				 * alternative c-'0' will also gives numeric value of character
				 * more on char to int conversion on
				 * https://stackoverflow.com/questions/3195028/please-explain-
				 * what-this-code-is-doing-somechar-48
				 * https://stackoverflow.com/questions/46343616/how-can-i-
				 * convert-a-char-to-int-in-java/46343671
				 */ 
				}
		}
		System.out.println("Sum Of all numbers: " + sum);
	}

}
