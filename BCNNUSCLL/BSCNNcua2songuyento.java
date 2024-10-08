package ngay23thang5;
import java.util.Scanner;
public class BSCNNcua2songuyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(BSCNN( 9, 8));
		
		// lưu 1 biến tạm 
	}
	public static int BSCNN(int a, int b ) {
		int t = a;
		while ( a % b != 0)
			a += t ;
		return a;
	}

}
