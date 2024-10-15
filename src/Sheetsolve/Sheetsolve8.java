package Sheetsolve;
import java.util.Scanner;

public class Sheetsolve8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n =in.nextInt();
		double sum =0.0;
		for(int i=2; i<=n;i++) {
			double num = 0.0, den = 1.0;
			for(int j=1; j<=i; j++) {
				num +=j;
				den *=j;
			}
			sum = sum + (num/den);
		}
		System.out.println("Sum="+ sum);

	}

}
