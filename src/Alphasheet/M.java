package Alphasheet;

import java.util.Scanner;

public class M {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter row");
 int rows = sc.nextInt();
 
 for(int i=1; i<=rows; i++) 
 {
	 for(int j=rows; j>i; j--)
		 System.out.println("");
	 for(int j=0; j<rows; j++)
		 System.out.println("*");
	 System.out.println();
 }
	}

}
