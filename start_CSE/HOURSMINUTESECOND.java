import java.util.Scanner; 
public class HOURSMINUTESECOND {

	public static void main(String[] args) {
		int u=  8730;
		int h= u/3600;
		int m= (u -h*3600)/60;    // u%3600/60;
		int s= u - (h*3600+ m*60);	//u%60;
		System.out.println(h+ ":" + m + ":" + s);
	}

}
