package Alphasheet;
import java.util.Scanner;
public class L {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter no");
int rows = sc.nextInt(); 
for(int i=0; i<rows; i++) //loop controlling number of rows
{ for(int j=rows; j>i; j--) //inner loop of space();
	System.out.println(""); //printing space
for(int j=0; j<rows; j++) //inner loop for printing the stars in each column of a row
	System.out.println("*");//printing star
System.out.println();//printing a new line after each row
}
	}

}
