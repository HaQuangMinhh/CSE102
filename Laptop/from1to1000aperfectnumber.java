package ngay12thang5;
import java.util.Scanner;
public class from1to1000aperfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		for (int i = 1; i <= 1000000 ; i++) 
		{
			int tong = 0;
			for (int n = 1; n <= i/2; n++ ) 
			{
				if ( i % n == 0) 
				{
					tong += n;
				}
			}
			if (tong == i ) 
				System.out.print(i+" ");
			
			
		}
	} 

}
