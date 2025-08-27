package ArrayProblems;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr= {3,2,1,18,9,90,32,6};
		int target =4;
		int ans = search(arr,0,target);
		System.out.println(ans);
		
	}
	
	static int search(int[] arr, int index , int target) {
		if(index >arr.length-1) {
			return -1;
		}
		return arr[index] == target ? index :  search(arr,index+1,target);
	}

}
