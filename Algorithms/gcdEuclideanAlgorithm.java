package CheatSheet;

public class gcdEuclideanAlgorithm {
	
	
	//EuclideanAlgorithm
	//gcd(a,b) = gcd(b, a%b) until b becomes 0
	//if a=12, b=18
	//gcd(12,18) = gcd(18, 18%12)
	//gcd(6, 18%6)
	//gcd(6, 0)
	public static void main(String[] args) {
		int a=12;
		int b=18;
		int ans = gcd(a,b);
		System.out.println(ans);
	}

	private static int gcd(int a, int b) {
		while( b!=0) {
			int temp =b;
			b = a%b;
			a =temp;
			
		}
		return a;
	}

}
