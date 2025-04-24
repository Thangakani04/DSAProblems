package Searching;

public class SearchInRangeLinearSearch {
	
	public static void main(String[] args) {
		
		int [] arr = {24,-7,14,3,6,7,83};
		int target=24;
		System.out.println(linearsearch(arr,target,1,4));		
	}
	
public static int linearsearch(int[] arr, int target , int start, int end) {
		
		if (arr.length == 0) {
			return -1;
		}
		for(int index=start;index<=end;index++) {
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		return -1;  //this line will execute if none of the return statements above have executed , hence the target not found
		
	}

}
