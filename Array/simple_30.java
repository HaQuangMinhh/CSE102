import java.util.*;
import java.io.*;
public class simple_30 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		
		printEvenEle(num);
		
	}
	// hàm input 
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0; i < n; i++) {
	//		arr[i] = sc.nextInt();
			arr[i] = rd.nextInt(15);
		}
		return arr;
	} 
	// output
	public static void output(int[] a) {
	//	for (int i = 0; i < a.length ; i++)
		for ( int i : a)
			System.out.print(i + " ");
		System.out.println();
	}
	// hàm xuất ra các phần tử chẵn trong dãy
	public static void printEvenEle(int[] e) {
		for (int i : e) 
			if (i % 2 ==0 ) 
				System.out.print(i+ " ");
	}
	

}
