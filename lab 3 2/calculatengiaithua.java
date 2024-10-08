import java.util.Scanner;

public class calculatengiaithua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		int i = 1;
		while ( i <= n) {
			answer *= i;
			i++;
		}
		System.out.print(answer);
		
	}

}
