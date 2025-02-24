package JavaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Duplicates are not allowed in hashset
		HashSet hs = new HashSet();  //default capacity is 16 Load factor is 0.75
		
		//Configure capacity 
		HashSet hs1 = new HashSet(100);  //Initial capacity
		
		//Configure capacity along with load factor
		
		HashSet hs2 = new HashSet(100,(float)0.90); 
		
		//Restrict the type of object or want to store similar type of object
		
		HashSet<Integer> hs3 = new HashSet<Integer>();
		
		//Add objects or elements into HashSet
		hs.add(100);
		hs.add("Hello!!");
		hs.add('N');
		hs.add(null);
		hs.add(9.7);
		hs.add(true);
		System.out.println(hs);  //insertion order not preserved, so when it prints it will be align in random order everytime we run the program

		//Remove
		hs.remove(9.7);  //it doesn't have index so we need to give value directly
		System.out.println(" After removing elements "+ hs);
		
		//Contains
		System.out.println(hs.contains('N'));
		System.out.println(hs.contains('n'));
		
		System.out.println(hs.isEmpty());
		
		//Reading elements from hashset using for each loop
		for(Object hsobj :hs) {
			System.out.println(hsobj);
		}
		
		//Reading elements from hashset using Iterator class
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());  // this loop will execute multiple times till it print all the elements from hashset object
		}
	}

}
