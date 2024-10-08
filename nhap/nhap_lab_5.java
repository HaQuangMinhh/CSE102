package nhap;
import java.util.Scanner; 

public class nhap_lab_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long n = sc.nextLong();
		long k = sc.nextLong();
		long answer = 1; 
		
		for ( int i = 0; i <= n; i++) {
			answer = ( x * n % k) % k;
		}
		System.out.println(answer);
	}

}
