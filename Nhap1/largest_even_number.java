package nhap;
import java.util.Scanner;
public class largest_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long i = 0;
		long a = 0, max = 0;
		
		while ( i < n) {
			a = n % 10;
			n = n / 10;
			;
			if (a % 2 ==0) {
				if (a > max) 
					max = a;
			}
		}
		System.out.println(max);
	}
	

}
