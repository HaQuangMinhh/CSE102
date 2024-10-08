import java.util.Scanner;
public class kiemtrasochinhphuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double t = Math.sqrt(n);
		int i = (int)t;
		boolean flag = (i*i == n)? true :false;
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
		
	}

}
