package nhap;
import java.util.*;
import java.io.*;
public class palindrome_array {
	
	static Scanner sc = new Scanner (System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		int n = num.length;
		reverse_array(num,n);
	}
	
// input
	public static int[] input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}
	// palindrome arry 
	public static void reverse_array (int a[], int n) {
		int b = 0;
		for ( int i = 0; i < n; i++) {
			if (a[i] != a[n-i-1]) 
				b = 1;
		}
		if ( b == 1) 
			System.out.println("NO");
		else 
			System.out.println("YES");
	}
}
