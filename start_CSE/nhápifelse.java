
public class nhápifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "abca";
		int kq = s1.compareTo(s2);
		if(kq==0)
			System.out.println("s1 = s2");
		else {
			if(kq<0)
				System.out.println("s1 < s2");
			else
				System.out.println("s1 > s2");
		
		}
	}

}
