import java.util.Scanner;
import java.util.Random;
public class Deletion_Queries_EIUPH013 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length ; i++)
			a[i] = sc.nextInt();
		int x; 
		int y;
		for ( int i = 0; i < m; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			int c = a.length;
			if ( x ==0) {
				if ( y < c)
					a = xoavt(a,y);
				else 
					continue;
			}
			if (x == 1) {
				if ( y < c) 
					System.out.println(a[y]);
				else 
					System.out.println( " -1 " );
			}
		}
			
	}
	// xoavt 
	public static int[] xoavt(int[] a, int k) {
		int[] e = new int[a.length -1 ];
		for ( int i = 0; i < k; i++)
			e[i] = a[i];
		for (int i = k; i < e.length; i++)
			e[i] = a[i+ 1];
		return e;
	}
	

	
	// input
	public static int[] input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i =0 ; i < n ;i++) 
			arr[i] = rd.nextInt(10);
		//	arr[i] = sc.nextInt();
		return arr;
			
	}
	// output 
	public static void output(int[] a) {
		for ( int i : a) 
			System.out.print(i +" ");
		System.out.println();
	} 

}
