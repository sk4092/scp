package com.scp.QuestionSet.ReverseNumber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//TO be reviewed
public class ReverseNumberArray {
	public static void main(String[] args) {
			int x=123456;
			List<Integer> xList=new ArrayList();
			while(x>0){
				xList.add(x%10);
				x=x/10;
			}
			
			Iterator<Integer> itr=xList.listIterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
	}
}
