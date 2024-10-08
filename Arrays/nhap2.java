import java.util.Random;
import java.util.Scanner;
public class nhap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int i;
		
		//input
		for ( i = 0; i <5 ; i++)
			num[i] = sc.nextInt();
		
		//output
		for (i = 0; i < 5;i++)
			System.out.println("num[" + i +"] = "+ num[i] );
	}

}
