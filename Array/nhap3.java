import java.util.Scanner;
import java.util.Random;
public class nhap3 {
// cách nhanh nhất 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] num = new int[5];
		
		
		//input
	//	for (int i = 0; i < 5;i++)
		for (int i = 0; i < num.length; i++)
			num[i] = rd.nextInt(100);
		
		//output
	//	for (int i = 0; i< 5;i++)
		for (int i = 0; i < num.length ;i++)
			System.out.println("num[" + i+ "] = " + num[i]);
	}

}
