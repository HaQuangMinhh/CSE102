import java.util.Scanner;

public class insert_x_to_position_k {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = input();
		output(num);
		int x=sc.nextInt();
		int k=sc.nextInt();
		num=themvt(num,x,k);
		output(num);	
	}
	public static int[] input() {
		System.out.println("input the number: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i]=sc.nextInt();
		return arr;
	}

	public static void output(int[] a) {
		for (int i : a)
			System.out.print(i + "  ");
		System.out.println();
	}
	
	public static int[] themvt(int[] a, int x, int k) {
		int[] e = new int[a.length + 1];
		int i;
		for (i = 0; i < k; i++)
			e[i] = a[i];
		e[k] = x;
		for (i = k + 1; i < e.length; i++)
			e[i] = a[i - 1];
		return e;
	}
}
