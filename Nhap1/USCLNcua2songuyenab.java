package nhap;
import java.util.Scanner;
public class USCLNcua2songuyenab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while ( a != b) {
			if ( a > b ) 
				a = a - b;
			else 
				b = b -a;
		}
		System.out.println(b);
	}

}
