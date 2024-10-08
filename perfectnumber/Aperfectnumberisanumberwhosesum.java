package ngay12thang5;
import java.util.Scanner;
public class Aperfectnumberisanumberwhosesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tong = 0;
		for (int i = 1; i <= (n-1); i++) {
			if ( n % i == 0) {
				tong += i;
			}
		} if (tong == n) {
			System.out.println("Yes");
		} else 
			System.out.println("No");
	} 

}

/* i < n or i <= (n-1) */