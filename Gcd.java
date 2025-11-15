package CheatSheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Gcd {
	
	public static void main(String[] args) {
		int a= 3649;
		int b= 3649;
		int ans = gcd(a,b);
		System.out.println(ans);
	}

	private static int gcd(int a, int b) {
		int max = Math.max(a, b);
		List<Integer> list = new ArrayList<Integer>();
		for(int i =1;i<= max;i++) {
			if(a%i == 0 && b%i==0) {
				list.add(i);
			}
		}
		Optional<Integer> maxGcd = list.stream().max((n1,n2) -> {
			return n1.compareTo(n2);
		});
		return maxGcd.get();
	}

}
