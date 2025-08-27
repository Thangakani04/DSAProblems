package ArrayProblems;

public class SortedArray {
	
	public static void main(String[] args) {
		//find if array is sorted or not
		int[] arr = {1,2,3,8,5,6,7,9};
		
		System.out.println(sorted(arr,0));  //index starts from 0
	}
	
	static boolean sorted(int[] arr, int index) {
		//base condition
		
		if(index == arr.length-1) {
			return true;
		}
		return arr[index] <arr[index+1] && sorted(arr,index+1);  //arr value is not changing here only the index value is getting changed
	}

}
