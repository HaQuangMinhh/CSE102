import java.util.Scanner;
public class useSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String can ="", chi="";
		switch(year%10) {
		case 0:
			can = "Canh";
			break;
		case 1:
			can = "Tân";
			break;
		case 2:
			can = "Nhâm";
			break;
		case 3:
			can = "Quý";
			break; 
		case 4:
			can = "Giáp";
			break;
		case 5:
			can = "Ất";
			break;
		case 6:
			can = "Bính";
			break;
		case 7:
			can = "Đinh";
			break; 
		case 8: 
			can = "Mậu";
			break;
		case 9:
			can = "Kỷ";
			break;  
		}
		switch(year%12) {
		case 0:
			chi = "Thân";
			break;
		case 1: 
			chi = "Dậu";
			break; 
		case 2:
			chi = "Tuất";
			break;
		case 3:
			chi = " Hợi";
			break;
		case 4:
			chi = "Tý";
			break;
		case 5:
			chi =" Sửu";
			break;
		case 6:
			chi = "Dần";
			break;
		case 7:
			chi = "mẹo";
			break;
		case 8:
			chi = "Thìn";
			break;
		case 9:
			chi =" Tỵ";
			break;
		case 10:
			chi = "Ngọ";
			break;
		case 11:
			chi = "mùi";
			break;
		}
			System.out.println(can +" "+ chi);
			sc.close();
		
	}

}
