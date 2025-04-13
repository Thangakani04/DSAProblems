package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubblesort(int[] arr) {
		//run the steps n-n times - i pointer
		
		for (int i=0;i<arr.length;i++) {
			
			//for each step max item will come at the last respective index - j pointer
			for (int j= 1; j<arr.length-i;j++) {
				
				//swap if the item is smaller than the previous item
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	}

	public static void swap(int[] arr, int j, int i) {
		int temp= arr[j];
		arr[j] =arr[i];
		arr[i] = temp;
		
	}

}
