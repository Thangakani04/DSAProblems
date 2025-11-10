package Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkippingString {
	
	public static void main(String[] args) {
		
		String[] input = {"apple" , "mango" ,"orange" , "apple" ,"orange"};
		List<String> list = Arrays.asList("apple" , "mango" ,"orange" , "apple" ,"orange");
		skipString(input);
		skipStringStream(list);
		System.out.println(skip("basdappleasdfghjjhgfdappleasdfgfdsapple"));
	}
	
	static String skip (String up) {
		
		if(up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith("apple")) {
			return skip(up.substring(5));
		}
		else {
			return up.charAt(0) + skip(up.substring(1));
		}
		
	}
	
	//without recursion
	static void skipString(String[] input) {
		List<String> list = new ArrayList<>();
		for(String s : input) {
			if(!s.equals("apple")) {
				list.add(s);
			}
		}
		
		System.out.println("Output : " + list);
	}
	
	//using stream
	static void skipStringStream(List<String> list) {
		List<String> ans = list.stream()
				.filter(str -> !str.equalsIgnoreCase("apple"))
				.collect(Collectors.toList());
		System.out.println("Output : " + ans);
	}

}
