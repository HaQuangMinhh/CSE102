import java.util.Scanner;
import java.util.Random;
public class common_number {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 1;
		int max = -1; 
		int count = 1;
		int value = 0;
		int b = 0;
		for ( int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		b = a[n-1];
		for ( int i = 0; i < a.length; i++) 
		{
			while (sum <= (n*(n-1))/2 ) 
			{
				int j = i + 1;
				while (j < a.length) 
				{
					if (a[i] == a[j]) 
					{
						count++;
						sum++;
					}
					else
						sum++;
					if ( max < count) 
					{
						max = count;
						value = a[i];
					}
					else 
					{
						if (max == count)
							if ( value > a[i])
								value = a[i];
					}
					j++;
				}
				count = 1;
				i++;
			}
		}
		if(max < 2)
			if ( value > b)
				value = b;
		System.out.println(value + " " + max);
		
		
	}

}
