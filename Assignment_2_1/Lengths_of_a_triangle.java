import java.util.Scanner;
public class Lengths_of_a_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a + b >c && b + c > b && a + c > b)
			System.out.println("a,b,c can form a triangle");
		else 
			System.out.println("a,b,c cann't form a triangle");
		
		
		
		
			
		
	}

}
