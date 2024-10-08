import java.util.Scanner;
public class CalculateSn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long S = 0;
		long P = 1;
		
		
		if (n < 1) 
			System.out.print("Wrong input");
		else
		{
			for ( int i = 1; i <= n; i++)  {
				P = P * i;
				S = S + P;
			}
			System.out.println(S);
			
		}	
	}

}
