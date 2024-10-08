package nhap;
import java.util.Scanner;
public class printarectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long longs = sc.nextLong();
		long height = sc.nextLong();
		
		for (int i = 1; i <= height ; i++) {
			for (int j = 1; j <= longs ; j++)
				System.out.print("* ");
			System.out.println();
		}
		
	}

}
