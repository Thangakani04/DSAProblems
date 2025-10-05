package Recursion;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int [] arr = {4,3,5,2,1};
		bubblesort1(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubblesort(int[] arr, int row, int col) {
		
		if(row==0) {
			return;
		}
		
		if(row>col) {
			if(arr[row]<arr[col]) {
				int temp=arr[row];
				arr[row] =arr[col];
				arr[col] = temp;
			}
			bubblesort(arr,row,col+1);
		}
		else {
			bubblesort(arr,row-1,0);
		}
	}
	
	  //kunal's solution
	
	  static void bubblesort1(int[] arr, int row, int col) {
			
			if(row==0) {
				return;
			}
			
			if(row>col) {
				if(arr[col]>arr[col+1]) {
					int temp=arr[row];
					arr[row] =arr[col];
					arr[col] = temp;
				}
				bubblesort1(arr,row,col+1);
			}
			else {
				bubblesort1(arr,row-1,0);
			}
		}

}
