import java.util.Scanner;
public class truyenthamtri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//truyenthamtri là 2 hàm tách biệt không liên quan gì hết 
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int y = 10;
		System.out.println("before: x = "+x+", y = ");
		
		sum_AB(x,y);
		
		System.out.println("after: x = "+x+", y = ");
		
	}
	public static void sum_AB(int x, int y) {
		x = y+10;
		y = x*2;
	}

}
