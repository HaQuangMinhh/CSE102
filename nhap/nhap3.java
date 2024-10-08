package nhap;
import java.util.*;
public class nhap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if (reverse_n(n)) 
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
	public static boolean reverse_n(long n) {
		long t = n;
		long num = 0;
		while ( n > 0) {
			num = num * 10 + n % 10;
			n /= 10;
		}
		return (t == num ) ? true : false;
	}

}
