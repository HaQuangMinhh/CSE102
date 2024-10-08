import java.util.Scanner;
public class ifelsemax3so {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c; 
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// int max = (a > b) ? a : b;
		
		//int max = ( a > b) ? a : b;
		// max = ( max>c) ? max : c;      hard 
		
		/* if (max > c)
			System.out.println(max);
		else 
			System.out.println(c); 	different way				*/     
		
		/*int d = (max >c) ? max : c;
		System.out.println(d);			*/
		
		int max = a;
		if(max <b)
			max = b; 
		if(max <c)
			max = c;
		System.out.println(max);
		
	
		
	}

}
