package nhap;
import java.util.Scanner;
public class printanemptyretangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			if ( i == 0 || i == n-1) {
				for ( int j = 1; j < m ; i++ );
					System.out.print("*" + " ");
					System.out.println();
			}
			else {
				System.out.print(" ");
				for ( int k = 1; k < m-1; k++) {
					System.out.print(" ");
					
				}
				System.out.print("  *");
				System.out.println();
			}
		}
			
	}

}
