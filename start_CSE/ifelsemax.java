import java.util.Scanner;
public class ifelsemax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in); 
		a = sc.nextInt();
		b = sc.nextInt();
		/* int max = a;
		 * if (max<b)
		 * max = b;
		 */
		int max = (a > b)?a : b;
		System.out.println(max);
	}

}
