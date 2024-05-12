package pair2;
import java.time.*;

public class PairTest2 {

	public static void main(String[] args) {
		LocalDate[] birthdays = 
			{ 
				LocalDate.of(1906, 12, 9), // G. Hopper
				LocalDate.of(1815, 12, 10), // A. Lovelace
				LocalDate.of(1903, 12, 3), // J. von Neumann
				LocalDate.of(1910, 6, 22), // K. Zuse
				LocalDate.of(2005, 9, 19) // Zahra Hilyah
			};
		Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());
	}

}
