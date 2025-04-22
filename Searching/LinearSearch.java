package Searching;

public class LinearSearch {
	
	//Linear search - start searching from the first element till you find the element which you looking for 

	public static void main(String[] args) {
		int[] arr = {4,7,65,12,9,5};
		int target = 9;
		int output= linearsearch(arr,target);
		System.out.println(output);

	}

	public static int linearsearch(int[] arr, int target) {
		
		if (arr.length == 0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		for(int n : arr) {
			if(n== target) {
				System.out.println("Element found");
			}
		}
		return -1;  //this line will execute if none of the return statements above have executed , hence the target not found
		
	}

}
