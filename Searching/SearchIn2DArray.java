package Searching;

import java.util.Arrays;

public class SearchIn2DArray {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{2,4,5},
				{18,4,5,76},
				{4,6,7,2},
				{8,9,3,4}
		};
		int target = 4;
		int[] output = search(arr,target);
		System.out.println(Arrays.toString(output));
		System.out.println("Max :" + max(arr));
		System.out.println("Min :" + min(arr));
		
		System.out.println("Max1 :" + max(arr));
		System.out.println("Min1 :" + min(arr));
	}

	public static int[] search(int[][] arr, int target) {
		
		for(int row =0; row < arr.length; row++) {
			for(int col =0;col <arr[row].length ; col++) {
				if(arr[row][col] == target) {
					return new int[] {row,col};
				}
			}
		}
		
		return new int[] {-1,-1};
	}
	
	public static int max(int[][] arr) {		
		int max = Integer.MIN_VALUE;
		
		for(int row =0; row < arr.length; row++) {
			for(int col =0;col <arr[row].length ; col++) {
				if(arr[row][col] > max) {
					max = arr[row][col];
				}
			}
		}
		
		return max;
	}
	public static int min(int[][] arr) {
		int min = Integer.MAX_VALUE;
			
			for(int row =0; row < arr.length; row++) {
				for(int col =0;col <arr[row].length ; col++) {
					if(arr[row][col] < min) {
						min = arr[row][col];
					}
				}
			}
			
			return min;
		}
	
	//using enhanced for loop
	
	public static int min1(int[][] arr) {
		int min = Integer.MAX_VALUE;
			
			for(int[] ar:arr) {
				for(int n :ar) {
					if(n < min) {
						min = n;
					}
				}
			}
			
			return min;
		}
	
	public static int max1(int[][] arr) {
		int max = Integer.MIN_VALUE;
			
			for(int [] ar:arr) {
				for(int n:ar) {
					if(n > max) {
						max = n;
					}
				}
			}
			
			return max;
		}

}
