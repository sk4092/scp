package com.scp.QuestionSet.ReverseString;

public class ReverseStringByteArray {
	public static void main(String[] args) {
		String s="Swapnil";
		byte [] bytes=s.getBytes();
		byte [] temp=new byte[s.length()];
		
		for(int i=bytes.length-1;i>=0;i--){
			temp[i]=bytes[bytes.length-i-1];
		}
		System.out.println("Reversed String: "+new String(temp));
	}
}
