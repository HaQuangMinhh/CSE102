import java.io.*;
import java.util.*;
public class tohoparray1 {

	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		
		if (findX(num, 0)== true ) 
			System.out.println("YES");
		else 
			System.out.println("NO");
	
	}
	// hàm input dùng để nhập dữ liệu cho 1 dãy
	public static int[] input() {
			System.out.println("input the number: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = rd.nextInt(10);
				//arr[i]=sc.nextInt();
			return arr;
	}

	// hàm output xuất 1 dãy ra màn hình
	public static void output(int[] a) {
		// for(int i=0;i<a.length;i++)
		for (int i : a)
			System.out.print(i + "  ");
		System.out.println();
	}	
	
	// hàm xuất ra các phần tử lớn hơn phần tử trung bình cộng của dãy
	public static void printEleAboveAvg(int[] e) { 
		//tính tổng 
		int s = 0;
		for ( int i : e) 
			s += i;
		
		// tính TBC
		double avg = (double) s / e.length;
		for ( int i : e)
			if ( i > avg)
				System.out.print(i+ " ");
		
		
	}
	// hàm tính tổng các phần tử chẵn trong dãy
	public static int sumEle(int[] e) {
		//tính tổng các phần tử chẵn 
		int s = 0;
		for ( int i : e) 
			if ( i % 2 == 0 )
				s += i;
		return s;
	}
	// hàm tìm phần tử là số nguyên tố lớn nhất trong dãy
		//kết quả trả về vị trí của SNT lớn nhất trong dãy
	
	
	// hàm tìm phần tử X có trong dãy hay không ?
	public static boolean findX(int[] e, int x)  {
		for ( int i = 0; i < e.length; i++ ) 
			if (e[i] == x)
				return true;
		return false;
	}
	
}
