package nhap;
import java.util.Scanner;
public class nhap5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		listNPrime(n);
	}
	//kiem tra so nguyen to
	public static boolean isPrime (int n) {
		if ( n < 2) 
			return false;
		for ( int i = 2; i <= Math.sqrt(n) ; i++) 
			if ( n % i  == 0) 
				return false;
		return true;
		
	}
	
	// ngto nho hon n 
	public static void listNPrime(int n) {
		for ( int i = 2; i < n; i++)
			if (isPrime(i))
				System.out.println(i + " ");
	}

}
