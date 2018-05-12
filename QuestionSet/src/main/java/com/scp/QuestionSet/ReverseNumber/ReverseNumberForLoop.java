package com.scp.QuestionSet.ReverseNumber;

public class ReverseNumberForLoop {
	public static void main(String[] args) {
		int num=2345;
		int reverse=0;
		for(;num>0;num=num/10){
			int rem=num%10;
			reverse=reverse*10+rem;
		}
		System.out.println("Reversed number using for loop= "+reverse);
}
}
