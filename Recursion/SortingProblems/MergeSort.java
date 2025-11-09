package Recursion;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		//int[] arr = {5,4,3,2,1};
		//arr= mergeSort(arr);
		//System.out.println(Arrays.toString(arr));
		//divide the array into 2 parts
		//get the both parts sorted via recursion
		//merge the sorted parts by using 2 pointers.
		
		int[] arr = {5,4,3,2,1};
		mergeSort1(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));//without copy of the original array, change the original array and merge it.
	}
	
	static int[] mergeSort(int[] arr) {
		if(arr.length ==1) {
			return arr;
		}
		int mid = arr.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));  //here original object of array is not being modified, its created new object array in every recursion call
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}
	

	private static int[] merge(int[] first, int[] second) {
		
		int i = 0;
		int j =0 ;
		int k=0;
		int [] mix = new int[first.length+second.length] ;
		
		while(i< first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k] = first[i];
				i++;
			}
			else {
				mix[k] = second[j];
				j++;
			}
			
			k++;
		}
		
		//if any of arrays is not complete
		//to copy the remaining elements
		while(i<first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}
		
		while(j<second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}	
		
		return mix;
	}
	
	static void mergeSort1(int[] arr,int s, int e) {
		if(e-s ==1) {
			return;
		}
		int mid = (s+e)/2;
		
		mergeSort1(arr, s, mid);  //here original object of array is not being modified, its created new object array in every recursion call
		mergeSort1(arr, mid, e);
		
		merge1(arr,s,mid,e);
	}

	private static void merge1(int[] arr, int s, int mid, int e) {
		int[] mix =new int[e-s];
		int i=s;
		int j=mid;
		int k=0;
		while( i<mid && j<e) { //eg ; {4,5  1,2,3} this same array is considered as 2 parts
			if(arr[i] <arr[j]) {
				mix[k] = arr[i];
				i++;
			}
			else {
				mix[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i<mid) {
			mix[k] = arr[i];
			i++;
			k++;
		}
		while(j<e) {
			mix[k] = arr[j];
			j++;
			k++;
		}
		//we need to copy this answer(mix) to original array
		for(int l =0;l<mix.length;l++) {
			arr[s+l] = mix[l];
		}
	}


}
