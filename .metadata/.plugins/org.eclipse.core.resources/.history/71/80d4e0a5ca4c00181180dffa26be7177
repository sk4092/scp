package com.scp.QuestionSet.SecondLargest;

public class SecondLargetWithoutSorting {
	public static void main(String[] args) {
		
		int[] nums={20,54,65,75,46,85,87,87,75,1000,1000,6987};
		findSecondLargestNumber(nums);
		
	}
	
	public static void findSecondLargestNumber(int [] nums){
		if(nums.length<2){
			System.out.println("Inavalid inpt");
			return;
		}
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for (int i : nums) {
			if(i>largest){
				secondLargest=largest;
				largest=i;
			}
			
			else if(i!=largest && i>secondLargest){
				secondLargest=i;
			}
		}
		
		if(secondLargest==Integer.MIN_VALUE)
			System.out.println("There is no second largest value in array");
		else
			System.out.println("Second Larget Number is "+secondLargest);
	}
}
