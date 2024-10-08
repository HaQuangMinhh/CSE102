package gfghfd;
import java.util.Scanner;
public class The_perimeter_of_a_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c; 
		Scanner reader = new Scanner(System.in);
		System.out.print("Input a: ");
		a = reader.nextFloat();
		System.out.print("Input b: ");
		b = reader.nextFloat();
		System.out.print("Input c: ");
		c = reader.nextFloat();
		
		System.out.println("Perimeter = " + (a + b + c));
		reader.close();
		
	}

}
