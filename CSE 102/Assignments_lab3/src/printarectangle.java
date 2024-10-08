import java.util.Scanner;
public class printarectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		long n = sc.nextLong();
		
		for ( int i=1 ; i <=n; i++)
		{
			for (int j= 1; j <= m; j++)
				System.out.print("* ");
			System.out.println();
		}
		 
	}

}
