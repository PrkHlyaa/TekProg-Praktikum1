package Kasus3;

import java.util.Scanner;

public class WeeklySales {
	
    public static void main(String[] args) {
    	SalesPerson[] salesStaff;
    	int size;
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("\nHow many Staff do you want to sort? ");
    	size = scan.nextInt();
    	scan.nextLine();
    	salesStaff = new SalesPerson[size];
    	
    	System.out.println("\nEnter the Staff's info");
    	for (int i = 0; i < size; i++) {
    		System.out.println("\nStaff  " + (i+1));
    		System.out.print("First Name	: ");
    		String firstName = scan.nextLine();
    		System.out.print("Last Name	: ");
    		String lastName = scan.nextLine();
    		System.out.print("Total Sales	: ");
    		int totalSales = scan.nextInt();
    		scan.nextLine();
    		
    		salesStaff[i] = new SalesPerson(firstName, lastName, totalSales);
    	} 
    	
        Sorting.insertionSort(salesStaff);
        
        System.out.println("\nRanking of Sales for the Week\n");
        for (SalesPerson s : salesStaff)
            System.out.println(s);
    	
    }
}