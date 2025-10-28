package DSAProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet linset =  new LinkedHashSet();
		//HashSet hset = new HashSet();
		
		LinkedHashSet<Integer> hset =  new LinkedHashSet<Integer>();
		
		hset.add(100);
		hset.add(200);
		hset.add(300);
		hset.add(400);
		hset.add(500);
		
		System.out.println(hset);
		

	}

}
