package Recursion;

public class ReverseNumber {
	
	public static void main(String[] args) {
		//reverse(4678);
		//System.out.println(sum);
		System.out.println(reverse2(1234));
	}
	
	 static int reverse2(int n) {
		//sometimes u might need some additional variables in that argument
		//in that case make another function (helper function)
		 
		int digits = (int)(Math.log10(n)) +1; //this formula is used to find the no of digits in n. but n should be n > 0
		return helper(n,digits);
		 
	}

	private static int helper(int n, int digits) {
		if(n%10 == n) { //if the number is a one digit then return number(n) itself.
			return n;
		}
		int rem = n%10;
		return rem * (int)(Math.pow(10, digits-1)) + helper(n/10,digits-1);
	}

	static int sum =0;
	static void reverse(int n) {
		if(n ==0) {
			return ;
		}
		
		int rem =n%10;
		sum = sum *10 +rem;
		reverse(n/10);
		
	}

}
