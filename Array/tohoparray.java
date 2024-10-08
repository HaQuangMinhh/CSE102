import java.io.*;
import java.util.*;
public class tohoparray {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] num = input();
	output(num);
	
	printPrimeEle(num);
	
	
	}
	// hàm xuất ra các phần tử là SNT trong dãy 
	public static void printPrimeEle(int[] e) {
		for (int i = 0; i < e.length ; i++)
			if (isPrime (e[i]))
				System.out.print(e[i]+ " ");
	}
	// hàm kiểm tra số nguyên tố
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for ( int i = 2; i <= Math.sqrt(n); i++)
			if(n % i == 0)
				return false;
		return true;
	}
	
	
	
	//input 
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0; i < n; i++) 
			arr[i] = rd.nextInt(10);
		return arr;
	}
	//output 
	public static void output(int[] a) {
		for (int i : a)
			System.out.print(i+ " ");
		System.out.println();
	}

}
