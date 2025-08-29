package ArrayProblems;

import java.util.ArrayList;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr= {3,2,1,18,9,9,32,6};
		int target =9;
		
		System.out.println(findindex(arr,target,0));		
		System.out.println(find(arr,target,0));	
		System.out.println(findindex1(arr,target,0));
		System.out.println(findback(arr,target,arr.length-1));
		System.out.println(findindexback(arr,target,arr.length-1));
		findAllIndex(arr,target,0);
		System.out.println(list);
		System.out.println(findAllIndexreturn(arr,target,0,new ArrayList<Integer>()));
		
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
	
	static ArrayList<Integer> list = new ArrayList<>(); //if you keep this inside , when function repeats new object will be created every function call.
	 static void findAllIndex(int[] arr,int target,int index) {
		if(index==arr.length) {
			return;
		}
		if(arr[index] == target) {
			list.add(index);
		}
		findAllIndex(arr,target,index+1);
	}
	 
	 static ArrayList<Integer> findAllIndexreturn(int[] arr,int target,int index,ArrayList<Integer> list) {
			if(index==arr.length) {
				return list;
			}
			if(arr[index] == target) {
				list.add(index);
			}
			 return findAllIndexreturn(arr,target,index+1,list);
		} 
	
	
}
