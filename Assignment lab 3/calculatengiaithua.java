import java.util.Scanner;
public class calculatengiaithua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		
		for (int i = 1; i <= n; i++) {
				answer *= i;
		}
		System.out.print(answer);
		
	}

}
