import java.util.Scanner;
public class Power_Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long n = sc.nextLong();
		long k = sc.nextLong();
		long t = 1;
		
		for ( int i = 1; i <= n; i++) {
			t = (t * x % k ) % k;
		}
		System.out.println(t);
	}

}
