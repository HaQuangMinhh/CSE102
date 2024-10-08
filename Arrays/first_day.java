import java.util.Scanner;
import java.util.Random;
public class first_day {
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		printEvenEle(num);
		
	}
	// hàm xuất ra các phần tử lớn hơn phần tử trung bình cộng của dãy.
	public static void printEleAboveAVG
	
	// hàm xuất ra các phần tử chẵn trong dãy
	public static int[] input() {
		System.out.println("input the number : ");
		int n = sc.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = rd.nextInt(50);
		return arr;
	
	}
	// hàm output xuất 1 dãy ra màn hình 
	public static void output(int[] a) {
		//for (int i = 0; i < a.length; i++)
		for ( int i : a)
			System.out.print(i + " ");
	}
	public static void printEvenEle(int[] e) {
		for ( i : a)
			if (i % 2 == 0)
	}

}
