import java.util.Scanner;
public class hamlietkecacsonguyentonhohonn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		listNPrime(n);
	}
	// hàm liệt kê các số nguyên tố nhỏ hơn N
	public static void listNPrime(int n) {
		for (int i =2; i<= n;i++) 
			if (isPrime(i))
				System.out.print(i+" ");
	}
	public static boolean isPrime(int n) {
		if (n<2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if( n %i == 0)
				return false;
		return true;
	}
	
	
	// hàm nhận đầu vào 1 số nguyên tố n, xuất ra n số nguyên tố đầu tiên 
	public static void list_First_N_Prime(int n) {
		int i = 2;
		int dem = 0;
		while ( dem < n) {
			if (isPrime(i)) {
				System.out.print(i+" ");
				dem++;
			}
			i++;
		}
	}
}
