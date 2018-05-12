package set;

import java.util.HashSet;

public class HashSetWorking {
	 public static void main(String args[]) 
	    {
	        // creating a HashSet
	        HashSet<String> hs = new HashSet<String>();
	         
	        // adding elements to hashset
	        // using add() method
	        boolean b1 = hs.add("Swapnil");
	        boolean b2 = hs.add("Sahil");
	         
	        // adding duplicate element
	        boolean b3 = hs.add("Sahil");
	        boolean b4 = hs.add("sahil");
	         
	        // printing b1, b2, b3
	        System.out.println("b1 = "+b1);
	        System.out.println("b2 = "+b2);
	        System.out.println("b3 = "+b3);
	        System.out.println("b4 = "+b4);
	         
	        // printing all elements of hashset
	        System.out.println(hs);
	             
	    }
}



