package Alphasheet;

public class K {

	public static void main(String[] args) {
int row=4;
int col=4;
for(int i=1; i<=row; i++) {
	for(int j=1; j<=i; j++) //this loop is for printing space
	System.out.println("");
	for(int j=1; j<=col; j++) //this loop is for printing stars
		System.out.println("*");
	System.out.println();
}
	}

}
