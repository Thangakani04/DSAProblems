package DSAProblems;

public class ReverseArray {
	
	public static void reversArray(int[] arr,int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
			start++;
			end--;
		}
	}
	
	public static void printArray(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		}

	public static void main(String[] args) {
		//int[] numbers = {8,7,6,3,1,4};
		int[] numbers = {8,7,6,3,1,4,2};
		printArray(numbers);
		reversArray(numbers,0,numbers.length-1);
		printArray(numbers);

	}

}
