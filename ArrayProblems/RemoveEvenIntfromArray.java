package DSAProblems;

public class RemoveEvenIntfromArray {
	
	public static void printArray(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static int[] removeEven(int [] arr) {
		int countOdd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 !=0) {
				countOdd++;
			}
		}
		int [] result = new int[countOdd];
		int idx =0;
		for(int i=0;i<arr.length;i++) {			
			if(arr[i] % 2 !=0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		int [] arr = {3,6,5,4,8,2,3,10,7};
		printArray(arr);
		int [] result = removeEven(arr);
		printArray(result);

	}

}
