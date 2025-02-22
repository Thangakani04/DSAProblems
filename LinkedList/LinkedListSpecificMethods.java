package DSAProblems;

import java.util.LinkedList;

public class LinkedListSpecificMethods {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add("Blue");
		l.add("Red");
		l.add("Green");
		l.add("Orange");
		l.add("Yellow");
		
		System.out.println(l);
		
		//Specific methods which are related to linkedList
		l.addFirst("Pink");  //pink will be added first position of linkedlist
		l.addLast("Grey"); 
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//Removing first and last elements
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	
		

	}

}
