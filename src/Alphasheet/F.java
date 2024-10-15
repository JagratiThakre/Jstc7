package Alphasheet;

public class F {

	public static void main(String[] args) {
      //Using label for outer and for loop 
		aa:
			for(int i=1; i<=3;i++)  //labeled loop
			{
				bb:
					for(int j=1;j<=3;j++) //labeled loop
						 {
						 if(i==2 && j==2) {
						 break aa;
						 }
						System.out.println(i+""+j);
					}
			}
	}
}

