package Recursion.Strings;

public class SkipingA {
	
	//with recursion
	public static void main(String[] args) {
		skip("" ,"baccad");
		String ans  = skip("baccaadfg");
		
		System.out.println(ans);
		
	}
	static void skip (String p , String up) {  //p-> processed , up -> unprocessed.
		 if(up.isEmpty()) {   //base condition
			 System.out.println(p);
			 return;
		 }
		 
		 char ch = up.charAt(0);
		 if(ch == 'a') {
			 skip(p ,up.substring(1));
		 }
		 else {
			 skip(p+ch , up.substring(1));
		 }
	}
	
	static String skip (String up) {  //p-> processed , up -> unprocessed.
		 if(up.isEmpty()) {   //base condition
			 
			 return "";
		 }
		 
		 char ch = up.charAt(0);
		 if(ch == 'a') {
			 return skip(up.substring(1));
		 }
		 else {
			 return ch + skip(up.substring(1));
		 }
	}

}
