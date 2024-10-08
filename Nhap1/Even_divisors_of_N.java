package gfghfd;
import java.util.Scanner;
public class Even_divisors_of_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if (n > 1) {
			for ( int i = 1; i <= n; i++) {
				if ( n % i ==0)
					System.out.print(i + " ");
			}
		}
		else 
			System.out.println("Wrong input");
	}

}
