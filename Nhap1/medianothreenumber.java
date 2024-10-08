package gfghfd;
import java.util.Scanner;
public class medianothreenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b , c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if ((a < b && b < c) || ( c < b && b < a))
		{
			System.out.println(b);
		}
		else
			if((b < a && a < c) || ( c < a && a < b))
			{
				System.out.println(a);
			} 
			else 
				System.out.println(c);
	}

}
