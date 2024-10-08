import java.util.Scanner; 
public class Prime_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int dem = 0;
		
		for ( long i = a; i <= b; i++)
			if (isPrime(i)) {
				dem++;
			}
		System.out.println(dem);
	
	
		
	}
	public static boolean isPrime(long n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i ==0)
				return false;
		return true;
	}

}
