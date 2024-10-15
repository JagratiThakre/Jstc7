package Sheetsolve;

public class Loop12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] number = new int[] {10,20,15,25,16,60,100};
int sum = 0;
for(int i=0;i<number.length;i++)
	sum=sum+number[i];
double average = sum/number.length;
System.out.println("Averagevale of array element is :"+average);
	}

}
