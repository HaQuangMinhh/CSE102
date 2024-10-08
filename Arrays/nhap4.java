import java.util.Scanner;
import java.util.Random;
public class nhap4 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		
	
		
	}
	// hàm input dùng để nhập dữ liệu cho 1 dãy 
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n;i++)
			arr[i] = rd.nextInt(50);
		return arr;	
		
	}
	// hàm output xuất ra 1 dãy trên màn hình
	public static void output(int[] a) {
	// for (int i = 0; i < a.length; i++)
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

}
