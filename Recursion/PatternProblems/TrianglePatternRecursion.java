package Recursion;

public class TrianglePatternRecursion {
	
	public static void main(String[] args) {
		
		//triangle(4,0);
		//Normaltriangle(1,0);
		triangle2(4,0);
	}
	
	 static void Normaltriangle(int row, int col) {
		
		 if(row>4) {
			 return ;
		 }
		
		if(row>col) {
			System.out.print("*");	
			Normaltriangle(row,col+1);
		}
		else {
			System.out.println();  //next line
			Normaltriangle(row+1,0);
		}
	}
	
	 static void triangle(int row, int col) {
		if(row ==0) {
			return;
		}
		
		if(row>col) {
			System.out.print("*");
			triangle(row,col+1);
		}
		else {
			System.out.println();  //next line
			triangle(row-1,0);
		}
	}
	 
	 static void triangle2(int row, int col) {
			if(row ==0) {
				return;
			}
			
			if(row>col) {
				triangle2(row,col+1);
				System.out.print("*");
			}
			else {
				
				triangle2(row-1,0);
				System.out.println();  //next line
				
			}
		}

}
