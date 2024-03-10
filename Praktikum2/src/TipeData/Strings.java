package TipeData;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String A = Input.next();
		String B = Input.next();
		Input.close();
		
		//menjumlahkan panjang string
		System.out.println(A.length() + B.length());
		
		//cek lexicographically
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		
		//kapitalisasi huruf pertama
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

	}

}
