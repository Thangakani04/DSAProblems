package PatternProblems;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		pattern1(5);
		pattern2(4);
		pattern3(5);
		pattern31(5);
		pattern4(5);
		pattern5(5);
	}
	
	private static void pattern1(int n) {
			
			System.out.println("Pattern 1");
				
				for(int row=1;row<=n;row++) {
					for(int col =1;col<=n;col++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
			}

	private static void pattern2(int n) {
		
		System.out.println("Pattern 2");
		
		for(int row =1;row<=n;row++) {
			
			//for every row run the column
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			//when one row is printed we need to add a new line
			
			System.out.println();
		}
		
	}
	
	
	private static void pattern3(int n) {
		
		System.out.println("Pattern 3");
		
		for (int row=n;row>0;row--) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	private static void pattern31(int n) {
		
		System.out.println("Pattern 31");
		
		for(int row =1;row<=n;row++) {
			
			//for every row run the column
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			//when one row is printed we need to add a new line
			
			System.out.println();
		}
		
	}
	
	private static void pattern4(int n) {
		
		System.out.println("Pattern 4");
		for(int row=1;row<=n;row++) {
			
			for(int col = 1;col<=row;col++) {
				
				System.out.print(col +" ");
			}
			
			System.out.println();
		}
		
	}
	
	private static void pattern5(int n) {
		
		System.out.println("Pattern 5");
		
		for(int row=1;row<=2*n;row++) {
			
			int totColInRow = row> n ? 2 * n -row : row;
			
			for(int col = 1;col<=totColInRow;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}
	
	


}
