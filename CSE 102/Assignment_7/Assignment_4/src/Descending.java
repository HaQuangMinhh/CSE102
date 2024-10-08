import java.util.Scanner;
public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		boolean descending;
		
		descending = Giamdan(n);
		if (descending) {
			System.out.println("YES");
		}
		else 
			System.out.println("NO");
		
	}
	public static boolean Giamdan (long n) {
		long b = n % 10;
		n /= 10;
		while (n > 0) {
			if (b <= n % 10) {
				b = n % 10;
			}
			else {
				return false;
			}
			n /= 10;
		}
		return true;
	}

}
