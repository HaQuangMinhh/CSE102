import java.util.Scanner;
public class calculateSn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n = sc.nextLong();
		double S = 0;
		double P = 1 ;
		
		if (n < 1)
			System.out.print("Wrong input");
		else 
		{
			for (int i = 1; i <= n; i++) {
				P = (double)2/(i*(i+1));
				S = (double)S+ P;
			}
			System.out.println(S);
		}
	}

}
