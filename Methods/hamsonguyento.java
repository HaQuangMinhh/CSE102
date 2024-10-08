import java.util.Scanner;

public class hamsonguyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println(n + " là số nguyên tố");
		else
			System.out.println(n + " không là số nguyên tố");
		
		}
	// hàm kiểm tra 1 số có phải số nguyên tố k ?
	public static boolean isPrime(int n) {
		boolean flag = true;
		if ( n < 2 )
			return !flag;
		for (int i =2 ; i <= Math.sqrt(n); i++)
			if (n%i ==0) {
				flag = false;
				break;
			}
		if (flag == true)
			return true;
		else
			return false; 
	}    
		
		
		
		
		
			
	 

}   /* không có rút ngắn 
    public static boolean isPrime(int n) {
		boolean flag = true;
		if ( n < 2 )
			return !flag;
		for (int i =2 ; i <= Math.sqrt(n); i++)
			if (n%i ==0) {
				flag = false;
				break;
			}
		if (flag = true)
			return true;
		else
			return false; 
	}    */

	
	// có rút ngắn 
/*	public static boolean isPrime(int n) {
		if (n<2)
			return false;
		for (int i =2; i <= Math.sqrt(n); i++)
			if (n%i ==0)
				return false;
		return true;
	}   	*/











