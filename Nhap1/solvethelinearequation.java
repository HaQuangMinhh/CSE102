package gfghfd;
import java.util.Scanner;
public class solvethelinearequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a , b, x;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		
		/* double bacnhat;
		if ( a + b > 0) {
			bacnhat = -b/ a;
			System.out.println(bacnhat);
			
		} else 
			if ( a + b < 0) {
				bacnhat = b / a;
				System.out.println(bacnhat);
			} else 
				if ( a + b == 0 || a - b == 0) {
					System.out.println(" x = 0 ");
					
				}
		*/
		if (a == 0)
		{
			if (b == 0)
				System.out.println("Infinite number of solutions");
			else {
				System.out.println("No solution");
			}
				
		} else {
			x = -b/a;
			System.out.println("x = " +x);
		}
			
		
	}

}

