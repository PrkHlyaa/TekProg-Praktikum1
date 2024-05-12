package case1;

//****************************************************************
//ParseInts.java
//
//Reads a line of text and prints the integers in the line.
//
//****************************************************************

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        line = scan.nextLine();
        Scanner scanLine = new Scanner(line);

        while (scanLine.hasNext()) {
            try {
                int val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // mengosongkan blok catch
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
