import java.util.Scanner;

public class printanemptyrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n;i++) {
			if (i==0 || i == n-1) {
				for (int j = 0; j < m; j++ ) 
					System.out.print("*"+"  ");
				System.out.println();
					
			}
			else {
				System.out.print("* ");
				for (int k =1; k < m-1;k++)
					System.out.print("   ");
				System.out.print(" *");
				System.out.println();
			}
		}
		
	}

}
