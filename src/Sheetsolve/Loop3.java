package Sheetsolve;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = 10, num1=0,num2=1;
System.out.println("Fibonacci Series of "+count+" numbers:");
int i =1;
while(i<count)
{
	System.out.println(num1+" ");
	int sumOfPrevTwo = num1 + num2;
	num1 = num2;
	num2 = sumOfPrevTwo;
}
	}

}
