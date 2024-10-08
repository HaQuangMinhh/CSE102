package nhap;
import java.util.Scanner;

public class nhap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Prime factors
		long n = sc.nextLong();
		long count = 0;
		long i = 2;
		
		while ( Math.abs(n) != 1 ) {
			boolean flag = false;
			while ( n % i ==0) {
				n /= i;
				flag = true;
				if (flag = true);
				count++;
			}
			if ( flag  = true) {
				System.out.println( i + " " + count);
				count = 0;
			}
			i++;
			
		}
	}

}
