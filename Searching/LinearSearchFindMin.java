package Searching;

public class LinearSearchFindMin {
	
	public static void main(String[] args) {
		int[] arr = {6,3,7,9,1,2,3};
		System.out.println(" Min : "+ min(arr));
		System.out.println(" Max : "+ max(arr));
	}

	public static int min(int[] arr) {
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
public static int max(int[] arr) {
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
