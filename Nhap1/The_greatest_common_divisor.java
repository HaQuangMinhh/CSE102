package gfghfd;
import java.util.Scanner;
public class The_greatest_common_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Greatest_common_divisor(12,60));
		
		
	}
	public static int Greatest_common_divisor(int a, int b) {
		while ( a != 0 && b != 0) {
			if (a > b) 
				a = a % b; 
			else 
				b = b %  a;
		}
		return a + b;
	}

}
