import java.util.Scanner;
import java.util.Random;
public class nhap4 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num = input();
		output(num);
		
		
	}
	// hàm input dùng để nhập dữ liệu cho 1 dãy 
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = rd.nextInt(10);
		return arr;
	
	
	}
	// hàm output xuất ra 1 dãy ra màn hình 
	public static void output(int[] a) {
		for ( int i : a )
			System.out.print(i + " ");
		System.out.println();
	}
	//hàm xuất ra các phần tử chẵn trong dãy
	public static void printEvenEle(int[] e) {
		for (int i : e)
			if (i % 2 == 0)
				System.out.print(i + " ");
	}
	// hàm xuất ra các phần tử ở vị trí chẵn trong dãy
	public static void printEvenidx(int[] e) {
		for (int i = 0; i < e.length ; i++ )
			System.out.print(i + " ");
	}
	// hàm tính tổng các phần tử chẵn trong dãy 
	public static int sumEle(int[] e) {
		int s = 0;
		for (int i : e)
			if ( i % 2 == 0)
				s += i;
		return s;
		
	}
	// hàm xuất ra các phần tử lớn hơn phần tử trung bình cộng của dãy 
	



}












