package Sheetsolve;
import java.util.Scanner;

public class Sheetsolve5 {

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter x:");
		int x =in.nextInt();
		System.out.println("Enter n:");
		int n = in.nextInt();
		
		double sum=0;
		int a =1;
		for(int i=1,j=1;i<=n; i++,j+=2)
		{
			double term=Math.pow(x, i)/j*a;
					sum+=term;
			a*=-1;
		}
		System.out.println("Sum="+sum);
	}
}
