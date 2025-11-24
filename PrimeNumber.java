package CheatSheet;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println(primeNumber());
		
		System.out.println(optimizesolutionprimeNumber());
	}

	private static boolean optimizesolutionprimeNumber() {
		int n=7;
		if(n <=1 ) {
			return false;
		}
		if(n %2==0) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i=3; i *i <=n; i =i+2) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}

	private static boolean primeNumber() {
		
		int n = 7;
		int count =1;
		
		for (int i=2;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		
		return count ==2 ? true : false;
		
	}

}
