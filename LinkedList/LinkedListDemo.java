package DSAProblems;

import java.text.Collator;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//Add multiple objects or elements into linkedlist
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList l1 = new LinkedList();
		l1.addAll(l);
		System.out.println(l1);
		l1.removeAll(l);
		System.out.println(l1);
		
		//Sorting - Collections.sort(Collection)
		
		System.out.println("Before sorting..");
		System.out.println(l);
		Collections.sort(l);
		System.out.println("After sorting..");
		System.out.println(l);
		
		//Sorting reverse order
		System.out.println("After sorting Reverse Order..");
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		
		//Shuffling
		System.out.println("After Shuffling");  //it will shuffle randomly
		Collections.shuffle(l);
		System.out.println(l);

	}

}
