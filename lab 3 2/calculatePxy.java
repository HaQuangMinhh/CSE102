import java.util.Scanner;
public class calculatePxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double t = 1;
		
		if (y<0)
		{
			x = 1/x;
			y = Math.abs(y);
		}
		for (int i =1; i <= y; i++) {
			t *= x;
		}
		System.out.println(t);
	}

}
