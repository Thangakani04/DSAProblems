package PatternProblems;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		pattern1(4);
		pattern2(5);
		pattern3(5);
	}

	private static void pattern1(int n) {
		
		for(int row =1;row<=n;row++) {
			
			//for every row run the column
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			//when one row is printed we need to add a new line
			
			System.out.println();
		}
		
	}
	
	
	private static void pattern2(int n) {
		System.out.println("pattern 2");
		for (int row=n;row>0;row--) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	private static void pattern3(int n) {
		
		for(int row=1;row<=n;row++) {
			for(int col =1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}


}
