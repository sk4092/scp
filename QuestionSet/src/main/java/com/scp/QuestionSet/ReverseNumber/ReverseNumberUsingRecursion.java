package com.scp.QuestionSet.ReverseNumber;

public class ReverseNumberUsingRecursion {
	public static void main(String[] args) {
		int num=3456;
		System.out.print("Reversed Number is: ");
		reverseNumber(num);
	}
	
	public static void reverseNumber(int num){
		if(num<10){
			System.out.print(num);
			return;
		}
		else{
			System.out.print(num%10);
			num=num/10;
			reverseNumber(num);
		}
	}
}