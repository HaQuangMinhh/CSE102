import java.util.*;
import java.io.*;

public class find_first_position {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int x = sc.nextInt();
		find_interger_position(n,x);
		
	}
	public static void find_interger_position (int n, int x) {
		int a = 0;
		int count = 0;
		if (n > 0 && n < 10000000) {
			while (n > 0) {
				a = n % 10 ;
				n = n / 10 ;
				count++;
				if(x == a) {
					System.out.println(count);
					
					break;
				}
					
			}
		}
	}

}
