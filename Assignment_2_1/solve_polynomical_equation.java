import java.util.Scanner;
public class solve_polynomical_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b,c ,x1 ,x2, delta;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = (b*b) - (4*a*c);
		if (delta < 0)	{
			System.out.println("No solution");
		} else if (delta == 0) {
			x1 = -b/(2*a);
			System.out.println("x = " +x1 );
		} else {
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("x1 = "+x1 + " , x2 = " +x2);
		}
			
		
	}

}
