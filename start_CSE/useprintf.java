import java.util.Scanner;
public class useprintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/* int a = 5, b = 10;
		 System.out.println( a+ " + "+b+" = "+(a+b));
		 System.out.printf("%d + %d = %d",a,b,a+b);
		*/
		
		// %d là số nguyên , %f số thập phân
		
		float a = 3.13355f;
		float b = 2.7675767f;
		System.out.println( a+ " + "+b+" = "+(a+b));
		System.out.printf("%f + %f = %.4f",a,b,a+b);
		// %,.2f : phần ngàn
		
	}

}
