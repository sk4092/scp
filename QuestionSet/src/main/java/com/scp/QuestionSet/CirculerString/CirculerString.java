package com.scp.QuestionSet.CirculerString;

public class CirculerString {
	public static void main(String[] args) {
		String s1="SwapnilKumbhar";
		String s2="KumbharSwapnil";
		String s3="pnilKumbharSwa";
		String s4="Swapnil";
		String s5="Swapnil Kumbhar";
		String s6="Kumbhar Swapnil";
		String s7=" KumbharSwapnil";
		System.out.println(checkCirculer(s1, s2));
		System.out.println(checkCirculer(s1, s3));
		System.out.println(checkCirculer(s2, s3));
		
		System.out.println(checkCirculer(s1, s4));
		System.out.println(checkCirculer(s1, s5));
		
		System.out.println(checkCirculer(s5, s6));
		System.out.println(checkCirculer(s5, s7));
		
		
	}
	
	public static boolean checkCirculer(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		else{
			if((s1+s1).indexOf(s2) != -1){
				return true;
			}
			else{
				return false;
			}
		}
	}
}
