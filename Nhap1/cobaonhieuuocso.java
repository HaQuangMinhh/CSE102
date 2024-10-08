package nhap;
import java.util.Scanner;
public class cobaonhieuuocso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dem = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) 
				dem++;
				System.out.print(i + " ");
		}
		System.out.println( "\n" + n + " có "+dem+" ước số." );
	}

}
