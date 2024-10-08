import java.util.Scanner;
public class nhap5songuyenN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a,b,c,d,e, count1 , count2;
		count1 =0;
		count2 = 0;
		
		if (n >= 10000 && n <= 99999)
		{
		
		a = (n / 10000);
		b = (n /1000) % 10;
		c = (n / 100) % 10;
		d = (n / 10) % 10;
		e = n % 10;
		
		int max = a;
		if ( max < b) 
			max = b;
		if ( max < c)
			max = c;
		if (max < d)
			max = d;
		if (max < e)
			max = e;
		System.out.println(max);
		
		
		
		
		double s = (double)(a+b+c+d+e)/5;
		System.out.println("The Arithmetic Mean of N is: " + s);
		
		
		if(a % 2 == 0)
			count1++;
		else 
			count2++;
		if (b % 2 == 0)
			count1++;
		else 
			count2++;
		if (c % 2 == 0)
			count1++;
		else 
			count2++;
		if (d % 2 == 0)
			count1++;
		else 
			count2++;
		if (e % 2 == 0)
			count1++;
		else 
			count2++;
		
		if ( count1 > count2) {
			System.out.println("N has more even numbers");
		} else {
			System.out.println("N has more odd numbers");
		}
		}
		else {
			System.out.println("Wrong input");
		}
		
		
		
		
		
		
	}

}
