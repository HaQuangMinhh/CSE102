import java.util.Scanner;
public class calculatethetaxipayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total =0;
		/* if (n > 0 && n < 2) {
			System.out.println("total = " + 13000);
		} if (n > 1 && n <= 29) {
			System.out.println("total = " + (+ 13000) + ((n-1)*12000)10);
		} if ( n > 29) {
			System.out.println("total = " + 13000 + 28*12000 + (n-29)*11000);
		} else 
			System.out.println("Fail");
		*/
		
		if (n>0) {
			if (n<2)
				total = 13000;
			if (n>= 2 && n<30)
				total = 13000 + (n-1)*12000;
			if( n>29)
				total = 13000 + 28*12000 + (n-29)*11000;
			System.out.println(total);
		} else 
			System.out.println("Wrong input!");
		
		
		
		
		}
		
	}

