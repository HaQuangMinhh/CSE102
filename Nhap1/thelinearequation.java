package nhap;

import java.util.Scanner;

public class thelinearequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a,b,bacnhat; 
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if (a + b > 0) {
			bacnhat = -b/a ;
			System.out.println(bacnhat);
		} else if ( a + b < 0) {
			bacnhat = b /a ;
			System.out.println(bacnhat);
		} else if ( a + b == 0 || a - b == 0 )
			System.out.println("x = 0");
		
		
	}

}
