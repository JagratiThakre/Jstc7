
//Write a program in java to find the sum of the given series: 
//s=a^2+a^2/2+a^2/3+......+a^2/10.
package Sheetsolve;
import java.util.*;

 class Sheetsolve3 {

	public static void main(String args[])
	 {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a:");
		int a = in.nextInt();
		double sum = 0.0;
		for (int i = 1; i <= 10; i++)
			
		{sum += Math.pow(a, 2)/i;//short and coding math.pow means 2 ki power 5( a is base and 2 is power)
		System.out.println("Sum =" + sum);
			}
	}
}
