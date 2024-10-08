import java.util.Scanner;
public class Prime_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long count = 0;
		long i = 2 ;
		while (Math.abs(n) != 1) {
			boolean flag = false;
			while ( n % i ==0) {
				n /= i;
				flag = true;
				if (flag = true)
					count++;
			}
			if(flag == true) {
				System.out.println(i+ " " + count);
				count = 0;
				
			}
			i++;
		}
		
	
	}
}
