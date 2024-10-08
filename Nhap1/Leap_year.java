package gfghfd;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a % 4 == 0) 
		{
			if (a % 100 ==0 ) 
			{
				if ( a % 400 == 0) 
				
					System.out.println("YES");
				else 
					System.out.println("NO");
				
				
			} else 
				System.out.println("YES");
		} else
			System.out.println("NO");
		sc.close();
	}

}
