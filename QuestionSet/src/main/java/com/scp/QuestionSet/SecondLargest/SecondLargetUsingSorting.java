package com.scp.QuestionSet.SecondLargest;

import java.util.Arrays;
import java.util.HashSet;

public class SecondLargetUsingSorting {
	public static void main(String[] args) {

		int[] nums = { 20, 54, 65, 75, 46, 85, 87, 87, 75, 1000, 1000 };
		findSecondLargestNumber(nums);
	}

	private static void findSecondLargestNumber(int[] nums) {
		
		if(nums.length<2){
			System.out.println("Inavalid inpt");
			return;
		}
		
		HashSet<Integer> numSet=new HashSet<Integer>();
		for (int i : nums) {
			numSet.add(i);
		}
		
		if(numSet.size()==1){
			System.out.println("There is no second largest value in array");
			return;
		}
		
		Object[] ints=numSet.toArray();
		Arrays.sort(ints);
		System.out.println("Second Highest: "+ints[ints.length-2]);
		
	}
}
