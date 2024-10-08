package nhap;
import java.util.Scanner;
public class Prime_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dem = 0;
		int i = 2;
		
		while (n != 1) {
			boolean flag = true; 
			while ( n % i ==0) {
				n /= i;
				if (flag)
					dem++;
			}
			i++;
		}
		System.out.println(dem);
	}

}
