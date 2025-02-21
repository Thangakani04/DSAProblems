package DSAProblems;

public class ArrayDemo {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println(); //to move the next line after printing the array
	}
	
	public void arrDemo(){
		
		int [] myArr =  new int[5];  //array will hold the default values , the default value willl be decided based on the size
		myArr[0] =8;
		myArr[1] =7;
		myArr[2] =5;
		myArr[3] =1;
		myArr[4] =3;
		myArr[2] =9;
		printArray(myArr);
	}

	public static void main(String[] args) {
		ArrayDemo demo = new ArrayDemo();
		demo.arrDemo();
		

	}

}
