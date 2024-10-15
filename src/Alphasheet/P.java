package Alphasheet;
import java.util.Scanner;
public class P {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter No");
int n = sc.nextInt();
for(int i=0; i<n; i++)
{
	for(int j=n-1; j>1; j--)
		System.out.println("");
	for(int j=0; j<=i; j++)
		System.out.println("*");
	System.out.println();
}
	}

}
