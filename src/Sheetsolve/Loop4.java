package Sheetsolve;
import java.util.Scanner;
class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count,num1 = 0,num2 = 1;
System.out.println("How may numbers you want in the sequence");
Scanner scan=new Scanner(System.in);
count = scan.nextInt();
scan.close();
System.out.println("Fibonacci Series of"+count+"numbers:");
int i=1;
while(i<=count)
{
	System.out.println(num1+" ");
	int sum = num1 + num2;
	num1 = num2;
	num2 = sum;
	i++;
}
	}

}
