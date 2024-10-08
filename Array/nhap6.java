import java.util.*;
import java.io.*;
public class nhap6 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		
		printEvenIdx(num);
		
		System.out.println("\n"+  sumEle(num));
		
		
	}
	// hàm tính tổng các phần tử chẵn trong dãy 
	public static int sumEle(int[] e) {
		int s = 0;
		for (int i : e)
			if (i % 2 ==0)
				s += i;
		return s;
	}
	// hàm xuất ra các phần tử chẵn trong dãy
	public static void PrintEvenEle(int[] e) {
		for ( int i : e) 
			if ( i % 2 == 0) 
				System.out.print(i + " ");
	}
	// hàm xuất ra các phần tử vị trí chẵn trong dãy
	public static void printEvenIdx(int[] e) {
		for ( int i = 0; i < e.length ; i += 2) 
			System.out.print(e[i]+ " ");
	}
	// input 
	public static int[] input () {
		System.out.println ( "input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0;i < n; i++)
			arr[i] = rd.nextInt(10);
	//		arr[i] = sc.nextInt();
		return arr;
			
	}
	// output xuất ra 1 dãy trên màn hình 
	public static void output(int[] a) {
		for (int i : a) 
			System.out.print(i + " ");
		System.out.println();
	}
}
