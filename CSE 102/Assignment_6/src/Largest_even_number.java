import java.util.Scanner;
import java.util.Random;
public class Largest_even_number {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
	
		if (findMaxEvenNum(num) == -1 )
			System.out.println(-1);
		else 
			System.out.println(num[findMaxEvenNum(num)]);
	
		
	}
	//input 
	public static int[] input() {
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr; 
	}
	// findMaxEvennum
	public static int findMaxEvenNum(int[] e) {
		int idx = -1;
		int i =0;
		while( i < e.length && !isEven(e[i]))
			i++;
		if (i == e.length)
			return -1;
		idx = i;
		for ( i = i+1 ; i  < e.length; i++)
			if (isEven(e[i]) && e[i] > e[idx] )
				idx = i;
		return idx;
	}
	// bien boolean isEven
	public static boolean isEven(int n) {
		if ( n % 2 ==0) 
			return true;
		else 
			return false;
	}
	

}
