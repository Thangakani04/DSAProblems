package PatternProblems;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		pattern28(5);
		pattern30(5);
		pattern17(4);
		pattern31(5);
		
	}

	private static void pattern28(int n) {
		
		for(int row =1;row<=2*n;row++) {
			int totalColInrow = row>n ? 2 * n -row : row;
			int spaces = n-totalColInrow;
			
			for(int s=1;s<=spaces;s++) {
				System.out.print(" ");
			}
			
			
			for(int col =1;col <=totalColInrow;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
	private static void pattern30(int n) {
		
		for(int row=1;row<=n;row++) {
			
			for(int space=1;space<=n-row;space++) {
				System.out.print("  ");
			}
			
			for(int col =row;col>=1;col--) {
				System.out.print(col + " ");
			}
			for(int col=2;col<=row;col++) {
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
		
	}
	
	private static void pattern17(int n) {
		
		for(int row=1;row<=2*n;row++) {
			int c = row>n ? 2* n-row : row;
			
			for(int space =1;space<=n-c;space++) {
				System.out.print("  ");
			}
			for(int col=c;col>=1;col--) {
				System.out.print(col + " ");
			}
			for(int col=2;col<=c;col++) {
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
		
	}
	
	private static void pattern31(int n) {
		int originaln= n;
		n = 2*n;
		for(int row=1;row<n;row++) {
			
			for(int col =1;col <n;col++) {
						int left = col;
						int right = n-col;
						int up=row;
						int down =n-row;
						int pattern = originaln - Math.min(Math.min(right, left), Math.min(up, down));
						
						System.out.print(pattern + " ");
				
			}
			
			System.out.println();
		}
		
	}



}
