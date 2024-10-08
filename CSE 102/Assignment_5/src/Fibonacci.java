import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fibonacci_print(n);
	}
	public static void Fibonacci_print(int n) {
		int f0 = 1;
		int f1 = 1;
		
		if (n < 1) {
			System.out.println("N must > 0");
			return;
		}
		if (n < 2) {
			System.out.println("1");
			return;
		}
		if (n < 3) {
			System.out.println("1 1");
			return;
		}
		// fn cho đại số gì cũng được
		int fn = 1;
		System.out.print("1 1 ");
		for (int i = 3; i <= n; i++) {
			fn = f1 + f0;
			System.out.print(fn + " ");
			f0 = f1;
			f1 = fn;
		}	
	}

}
