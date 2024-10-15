package Sheetsolve;

public class dowhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 0;
 aa:
	 while(a<10)
	 {
		 if(a==5)
		 {
			 a=a+1;
			 continue aa;//it is terminate and start from a=0;
		 }
		 a=a+1;
		 System.out.println("himanshu:"+a);
	 }
	}
	 
}