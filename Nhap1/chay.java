package nhap;
import java.util.Scanner;
public class chay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	/*	for (int i = 1; i <= a; i++) {
			if ( a % i ==0 ) {
				System.out.print(i + " ");
			}
		}    */
	
		int i = 1;
		while ( i <= a) {
			if ( a % i ==0)
				System.out.print(i + " ");
			i++;
		}	
	}
	

}
