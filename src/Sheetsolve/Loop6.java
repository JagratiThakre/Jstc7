package Sheetsolve;
import java.util.Scanner;
public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int number = sc.nextInt();
long fact = 1;
int i =1;
while(i<=number)
{
	fact = fact*i;
	i++;
}
System.out.println("Factorial of"+number+"is:"+fact);
	}

}
