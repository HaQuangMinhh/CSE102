package gfghfd;
import java.util.Scanner;

public class The_perimeter_of_a_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input r: ");
		r = sc.nextFloat();
		System.out.println("Perimeter = " + 2 * 3.14 * r);
		sc.close();
	}

}
