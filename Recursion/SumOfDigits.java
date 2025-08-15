package Recursion;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int ans = sumdigits(12345);
		System.out.println(ans);
	}
	
	static int sumdigits(int n) {
		
		if(n==0) {
			return 0;
		}
		return (n%10) + sumdigits(n/10);
		 
		
		
	}

}
