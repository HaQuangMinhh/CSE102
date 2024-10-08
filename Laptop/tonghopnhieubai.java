package ngay23thang5;
import java.util.Scanner;
public class tonghopnhieubai {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	if ( reverse_n(123321))
			System.out.println("Yes");
		else 
			System.out.println("No");   */
		System.out.println( find_prime_near_X(int x));
		
	}
	
	
	
	// nhập vào 1 số nguyên n cho đến khi gặp n là SNT
	public static void input_until_prime() {
		
		int n;
		do {
			System.out.print("int put interger: ");
			n = sc.nextInt();
			if (isPrime(n))
				System.out.println(n);
		}
		while (!isPrime(n));
		
		
	/*	 ! là phủ định, cụm isPrime : phủ định = khẳng định 
		 if là số NT thì xuất ra, k f là nhập lại 
		 ch f SNT thì quay lại do làm tiếp 
		 lặp lại khi đúng mới while mới cho qua   */
		
	}
	
	
	
	// bài 4: nhập vào 1 số nguyên X
	// hàm ktra 1 số x có là SNT không ? hoặc tìm SNT gần x nhất 
	public static int find_prime_near_X(int x) {
		int left = x;
		int right = x;
		// 2 thằng left and right đều f là false mới chạy tiếp 
		while (!isPrime(left) && !isPrime(right)) {
			left--;
			right++;
			
		}
		if (isPrime(left))
			return left;
		return right;
		//		
	}
 /*	 nhập 1 số nguyên n, kiểm tra xem n có là số đối xứng hay không ?
	 ex : 12321
	 123321.
	 hàm in n theo thứ tự ngược lại   */ 
	
	public static boolean reverse_n(int n) {
		int t = n;
		int num = 0;
		while ( n > 0) {
			num = num * 10 + n % 10;
	
			n /= 10;
	
		}
		System.out.println(num);
		return false;
        // cách 2 : return ( t == num)? true : false;	
	}
	//  hàm kiểm tra 1 số có phải số nguyên tố hay không ?
	public static boolean isPrime(int n) {
		
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if ( n % i == 0)
				return false;
		return true;	
	}
	

}
