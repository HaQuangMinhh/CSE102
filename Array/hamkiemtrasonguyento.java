import java.util.*;
import java.io.*;
public class hamkiemtrasonguyento {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		
		if (isPrime(n) == true)
			System.out.print("Yes");
		else 
			System.out.print("NO");
		
	}
/*	// hàm input
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0; i < n; i++) 
			arr[i] = rd.nextInt(10);
		return arr;
		
	}
	// hàm output
	public static void output(int[] a) { 
		for ( int i = 0; i < a.length; i++)
			System.out.print(i + " ");
		System.out.println();
	} 						*/
	// hàm kiểm tra số nguyên tố 
	public static boolean isPrime(int n) {
		if (n < 2) 
			return false ;
		for ( int i = 2; i <= Math.sqrt(n); i++) 
			if(n % i == 0) 
				return false;
		return true;
	}

}
