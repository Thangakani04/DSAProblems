package Searching;

import java.util.Arrays;

public class SearchInStringLinearSearch {
	
	public static void main(String[] args) {
		String str = "Thangakani";
		char target = 'g';
		System.out.println(linearsearch(str,target));
		System.out.println(Arrays.toString(str.toCharArray()));
		
	}
	
	public static boolean linearsearch1(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		for(char c : str.toCharArray()) {
			if(c == target) {
				return true;
			}

		}
		return false;
	}

	public static boolean linearsearch(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == target) {
				return true;
			}

		}
		return false;
	}

}
