package Recursion.Strings;

public class SkipAppNotApple {
	
	public static void main(String[] args) {
		//skip app only if its not apple
		
		String str ="abgappklapplehj";
		System.out.println(skip(str));	
	}

	private static String skip(String str) {
		if(str.isEmpty()) {
			return "";
		}
		
		if(str.startsWith("app") && !str.startsWith("apple")) {
			return skip (str.substring(3));
		}
		else {
			return str.charAt(0) + skip(str.substring(1));
		}
		
	}

}
