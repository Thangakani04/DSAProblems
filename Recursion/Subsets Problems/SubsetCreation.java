package Recursion.Subsets;

public class SubsetCreation {
	
	public static void main(String[] args) {
		
		//subset is for arrays
		//subseq is for strings
		subseq("","abc");
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

}
