import java.util.Scanner;
import java.util.Random;
public class Demsolanlap_EIUPH014 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			n = sc.nextInt();
			int[] num = input(n);
			if ( n == 0) 
				break;
			int a = dem_so_lan(num);
			System.out.println(a);
		}
		while (n>0);
		
	}
	public static int[] input(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n ; i++) 
			arr[i] = sc.nextInt();
		return arr;
	}
	public static boolean kiem_tra_day(int[] a) {
		int value = a[0];
		for (int i = 1; i < a.length; i++)
			if ( value != a[i])
				return false;
		return true;
	}
	public static int dem_so_lan(int[] a) {
		int count = 0;
		int i ; 
		while ( kiem_tra_day(a) == false) {
			int k = a[0];
			count++;
			int n = a.length;
			for (i = 0; i < a.length -1; i++)
				a[i] = Math.abs(a[i]- a[i+1]); i++;
			a[n-1] = Math.abs(a[n-1]- k );
			if ( count == 1000) {
				count =-1;
				break;
			}
		}
		return count;
	}

}
