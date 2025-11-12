package Recursion.Subsets;

import java.util.ArrayList;

public class SubsetCreation {
	
	public static void main(String[] args) {
		
		//subset is for arrays
		//subseq is for strings
		//subseq("","abc");
		System.out.println(subseqReturn("","abc"));
	}
	
	static void subseq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		subseq(p+ch , up.substring(1));  //add it
		subseq(p  , up.substring(1));  //remove it
		
	}
	
	static ArrayList<String> subseqReturn(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> left = subseqReturn(p+ch, up.substring(1)); //add it
		ArrayList<String> right = subseqReturn(p,up.substring(1)); //remove it
		left.addAll(right);
		return left;
	}

}
