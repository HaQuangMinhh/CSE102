package gfghfd;
import java.util.Scanner;
public class findtheabsolutevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a < 0) {
			a =(-1)*a;
			System.out.println(a);
		}
		else 
			System.out.println(a);
	}

}
