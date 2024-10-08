import java.util.Scanner;
public class introduce_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int kq = sum_AB(x,y);
		System.out.println(kq);
	}
	public static int sum_AB(int a , int b ) {
		return a + b;
	}
	public static double sum_AB(double a, double b) {
		if (a > b)
			return a+b;
		// tự động ngắt vòng lặp nên không cần dùng else
		return a*b;
	}

}
