import java.util.Scanner;
public class afunction_toprintallprimenumbers {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		listNPrime(n);
		
	}
	//hàm kiểm tra 1 số có phải số nguyên tố không 
	
 	public static boolean isPrime(int n) {
		if ( n < 2)
			return false; 
		for (int i = 2; i <= Math.sqrt(n); i++)
			if ( n % i ==0)
				return false;
		return true;
		
	}    
	// list of ngto nho hon n
	public static void listNPrime(int n) {
		for (int i = 2; i < n; i++)
			if ( isPrime(i))
				System.out.print(i + " ");
	}
 
}
