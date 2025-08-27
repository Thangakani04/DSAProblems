package ArrayProblems;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr= {3,2,1,18,9,90,32,6};
		int target =4;
		int ans = search(arr,target,0);
		System.out.println(ans);
		
	}
	
	static int search(int[] arr, int target,int index) {
		if(index >arr.length-1) {
			return -1;
		}
		return arr[index] == target ? index :  search(arr,target,index+1);
	}

}
