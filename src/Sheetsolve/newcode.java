package Sheetsolve;
import java.util.Scanner;
class newcode {

	public static void main(String[] args) {
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		while(number>=0) {
			
			sum+= number;//sum=sum+number
			System.out.println("Enter a number");	
			number--;
		

	}

}
}
