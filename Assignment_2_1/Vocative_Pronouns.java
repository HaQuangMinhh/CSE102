import java.util.Scanner;
public class Vocative_Pronouns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String gender = "Nam";
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		gender = sc.next();
		
		if (age > 5) {
			if (age>20) {
				if(gender.equals("Nam")) {
					if(age <= 35) {
						System.out.println("Anh");
					} else if(age <= 60) {
						System.out.println("Chu");
				} else {
					System.out.println("Ong");
				}
			} else {
				if(age <= 35) {
					System.out.println("Chi");
				}
				else if (age <= 60) {
					System.out.println("Co");
				} else {
					System.out.println("Ba");
				}
			}
		}
				else 
					System.out.println("Em");
			}
		 else 
			System.out.println("Be");
		 	
	
	}	

}
