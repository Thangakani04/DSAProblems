package Recursion.Strings;

import java.util.stream.Collectors;

public class StringProblems {

	//without recursion
	public static void main(String[] args) {
			
		//Basic string questions.
		//Q1: you have given string , you have to show some other string from the given string that has removed all 'a' s from it.
		//input = baccad , output = bccd
		String input = "baccad";
		String output= skipcharA(input);
		System.out.println(output);
		
		//using character array
		String out= skipAproblem(input);
		System.out.println(out);
		
		
		//using streams
		String ans = skipAusingStream("baccad");
		System.out.println(ans);
		
			
	}


	private static String skipAusingStream(String string) {
		String ans = string.chars()  //this just converts the int of stream
				.filter( c -> c != 'a') 
				.mapToObj(c -> String.valueOf((char)c))  //here converting to string
				.collect(Collectors.joining())
				.toString();
		
		return ans;
		
	}

	private static String skipcharA(String input) {
		
		String output = input.replaceAll("a", "");
		return output;
		
		
	}
	
	static String skipAproblem(String in) {
		char[] arr = in.toCharArray();
		String output ="";
		
		StringBuilder sb = new StringBuilder();
		for(char c: arr) {
			if(c != 'a') {
				output = output + c; //use either stringbuilder or string
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
