package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,2,5,1};
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void selectionsort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int lastindex = arr.length-i-1;
			int maxindex = getMaxIndex(arr,0,lastindex);
			swap(arr,maxindex,lastindex);
		}
		
	}

	public static void swap(int[] arr, int maxindex, int lastindex) {
		int temp = arr[maxindex];
		arr[maxindex] = arr[lastindex];
		arr[lastindex] = temp;
		
		
	}

	public static int getMaxIndex(int[] arr, int start, int end) {
		int max =start;
		
		for(int i=start;i<=end;i++) {
			if(arr[i] > arr[max]) {
				max=i;
			}
		}
		return max;
	}

}
