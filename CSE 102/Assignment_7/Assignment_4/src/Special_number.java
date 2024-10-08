import java.util.Scanner;
public class Special_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long lastDigit = n % 10;
		long firstDigit = 0;
		long a = n;
		if (n < 100)
			System.out.println("NO");
		else {
			while (n > 0) {
				if (n < 10) {
					firstDigit = n;
					break;
				}
				n /= 10;
				
			}
			long answer = firstDigit * 10 + lastDigit;
			if (a % answer ==0)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
		
	}

}
