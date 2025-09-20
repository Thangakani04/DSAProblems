package Recursion;

public class RBS {
	public static void main(String[] args) {
		
		
		int[] arr = {5,6,7,8,9,1,2,3,4};
		int target =9;
		
		System.out.println(roatatedBinarysearch(arr,target,0,arr.length-1));
	}

	private static int roatatedBinarysearch(int[] arr, int target, int s, int e) {
		
		if(s>e) {
			return -1;
		}
		int mid = s + (e-s)/2;
		
		if(arr[mid] ==target) {
			return mid;
		}
		
		//checks whether the first part of array is started
		if(arr[s]<=arr[mid]) {
			
			if(target>=arr[s] && target< arr[mid]) {
				return roatatedBinarysearch(arr,target,0,mid-1);
			}
			else {
				return roatatedBinarysearch(arr,target,mid+1,e);
			}
		}
		
		if(target>=arr[mid] && target<=arr[e]) {
			return roatatedBinarysearch(arr,target,mid+1,e);
		}
		else {
			return roatatedBinarysearch(arr,target,s,mid-1);
		}
		
	
	}

}
