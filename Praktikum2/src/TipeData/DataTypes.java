package TipeData;
import java.util.Scanner;

class DataTypes {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int n=Input.nextInt();
		
		for (int i=0; i<n; i++) {
			try {
				long x = Input.nextLong();
				System.out.println(x+" can be fitted in: ");
				if(x>=-128 && x<=127) System.out.println("* byte");
                if(x>=-32768 && x<=32767) System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647) System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L) System.out.println("* long");
			}
			catch(Exception e) {
				System.out.println(Input.next()+" can't be fitted anywhere.");
			}
		}
		Input.close();
	}

}
