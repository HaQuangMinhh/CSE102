import java.util.Scanner;
import java.util.Random;
public class First_occurence {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		num = xoa_trung(num);
		output(num);
		
		
	}
	//xoa trung
	public static int[] xoa_trung(int[] a) {
		for (int i = 0; i < a.length ; i++) {
			if (find_X(a, a[i], i)) {
				a = xoavt(a,i);
				i--;
			}
		}
		return a;  
	}
	// xoa vi tri 
	public static int[] xoavt(int[] a, int k ) {
		int[] e = new int[a.length - 1] ;
		for (int i = 0; i < k; i++) 
			e[i] = a[i];
		for (int i = k;i < e.length;i++)
			e[i] = a[i +1];
		return e;
	}
	// tim X
	public static boolean find_X(int[] a,int x, int k) {
		for (int i = 0; i < k ; i++) 
			if ( a[i] == x)
				return true;
		return false;
	}
	// input
	public static int[] input() {
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0; i < n; i++) 
	//		arr[i] = rd.nextInt(10);
			arr[i] = sc.nextInt();
		return arr;
	}
	// output
	public static void output(int[] a) {
	//	for ( int i = 0; i < a.length ; i++)
		for (int i : a )
			System.out.print(i+ " ");
		System.out.println();
	}

}
