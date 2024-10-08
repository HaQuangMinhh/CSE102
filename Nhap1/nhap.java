package nhap;
import java.util.Scanner;
public class nhap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i = 0;
		while (true) {
			i++; 
			if ( i == 0 || i == 4 || i == 7) 
				continue;
			System.out.println(i + "  ");
			
			if ( i > 10) {
				break;
			
			}
		}
	}

}
