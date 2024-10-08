import java.util.Scanner;
public class hamperfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i =1; i <10000000; i++)
			if (isPerfectNumber (i))
				System.out.print(i+ " ");
		
	}
	// hãy kiểm tra 1 số có phải số hoàn hảo k ?
	public static boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i =1; i <= n/2; i++) 
			if (n%i ==0)
				sum += 1;
		if (sum ==n)
			return true;
		return false;
	}

}
