import java.util.Scanner;
import java.util.Random;
public class nhap5 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		
		System.out.println(findMax(num));
	}
	// hàm input 
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0; i < n; i++)
			arr[i] = rd.nextInt(100);
		return arr;
		
	}
	// hàm xuất ra các phần tử chẵn trong dãy 
	public static void printEvenEle(int[] e) {
		for (int i : e )
			if ( i % 2 == 0)
				System.out.print(i + " ");
	}
	// hàm output ra màn hình 
	public static void output(int[] a) {
		for ( int i : a )
			System.out.print(i + " ");
		System.out.println();
	}
	// hàm xuất ra phần tử ở vị trí chẵn trong câu 
	public static void printEvenIdx (int[] e) {
		for ( int i = 0; i < e.length; i += 2) {
			System.out.print(e[i] + " ");
		}
	}
	
	// hàm xuất ra các phần tử là Số nguyên tố trong dãy 
	public  static void printPrimeEle(int[] e) {
		for (int i = 0; i < e.length; i++)
			if(isPrime(e[i]))
				System.out.print(e[i] + " ");
	}
		// kiểm tra số nguyên tố , dùng hàm kiểm tra số nguyên tố 
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i =2; i <= Math.sqrt(n); i++)
			if (n % i ==0)
				return false;
		return true;
	}
	// hàm tìm phần tử lớn nhất trong dãy ( kết quả trả về vị trí (index) của số lớn nhất )
	public static int findMax(int[] e) {
		int max = e[0];					// hàm tìm phần tử lớn nhất 
		for (int i = 0; i < e.length; i++)
			if (e[i] > max)
				max = e[i];
		return max;
	}// phần tử lớn nhất trả về vị trí value // có chụp ảnh để xuất ra hàm main
	public static int findMax2value (int[] e) {
		int idx = 0;
		int max = 
	}
	// hàm đếm số lần xuất hiện của x trong dãy
	
	
	// hàm tìm phần tử là số nguyên tố lớn nhất trong dãy
	
	
	// tìm phần tử xuất hiện nhiều nhất trong dãy
	
	
	
	
}
