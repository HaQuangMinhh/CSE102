import java.util.Scanner;
import java.util.Random;
public class nhap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] num = new int[5];
		num[2] = 10;
		num[3] = 7;
		num[4] = num[2]*2 + num[3];
		
		System.out.println("num[0] = " + num[0]);
		System.out.println("num[1] = " + num[1]);
		System.out.println("num[2] = " + num[2]);
		System.out.println("num[3] = " + num[3]);
		System.out.println("num[4] = " + num[4]);
	}

}
