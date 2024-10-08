import java.util.Scanner;
public class Print_all_even_divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i =1; i <= n; i++) {
			if (n % i ==0 ) {
				if ( n / i == i) {
					System.out.print(i + " ");
				}
			} 
		}
	}

}
