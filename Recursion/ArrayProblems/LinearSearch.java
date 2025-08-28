package ArrayProblems;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr= {3,2,1,18,9,9,32,6};
		int target =91;
		
		System.out.println(findindex(arr,target,0));		
		System.out.println(find(arr,target,0));	
		System.out.println(findindex1(arr,target,0));
		System.out.println(findback(arr,target,arr.length-1));
		System.out.println(findindexback(arr,target,arr.length-1));
		
	}
	//my solution
	static int findindex(int[] arr, int target,int index) {
		if(index ==arr.length) {
			return -1; //if target is not present return -1
		}
		return arr[index] == target ? index :  findindex(arr,target,index+1);
	}
	
	//Kunal solution
	
	static boolean find(int[] arr, int target, int index) {
		if(index == arr.length) {
			return false;
		}
		return arr[index] == target || find(arr,target,index+1);
	}
	
	static int findindex1(int[] arr, int target, int index) {
		if(index == arr.length) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		}
		else {
			return findindex1(arr,target,index+1);
		}
	}
	
	//if you want to search from back
	static boolean findback(int[] arr, int target, int index ) {
		if(index == -1) {
			return false;
		}
		return arr[index] ==target || findback(arr,target,index-1);
	}
	static int findindexback(int[] arr, int target, int index) {
		if(index == -1) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		}
		else {
			return findindexback(arr,target,index-1);
		}
	}
	
	

}
