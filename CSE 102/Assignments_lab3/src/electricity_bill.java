import java.util.Scanner;
public class electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		
		if (n <= 100) 
			System.out.println(n*200); 
		else if ( n < 1100) 
			System.out.println(20000+ (n-100)*500);
		else if ( n < 3100)
			System.out.println(20000+ (1000*500)+ (n-1100)*1000);
		else if (n <= 8100)
			System.out.println(20000+ (1000*500) +(2000*1000)+ (n-3100)*10000);
		else if (n < 18100) 
			System.out.println(20000 + (1000*500) +(2000*1000)+ (5000*100000) +(n-8100)*12000);
		else 
			System.out.println(20000+ (1000*500)+(2000*1000)+ (5000*100000)+ (10000*12000) + (n-18100)*1000000);
		
	}

}
