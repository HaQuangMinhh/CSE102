import java.util.Scanner;
public class tínhdiemcuoiky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float att = sc.nextFloat();
		float lab = sc.nextFloat();
		float min_final = ((50 - (float)(att*0.2 +lab*0.3))*2);
		System.out.println(min_final);
	}

}
