package Kasus3;

public class SalesPerson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public SalesPerson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + "\t: " + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((SalesPerson) other).getLastName()) &&
                firstName.equals(((SalesPerson) other).getFirstName()));
    }

    public int compareTo(Object other) {
    	SalesPerson otherSalesperson = (SalesPerson) other;
        if (this.totalSales == otherSalesperson.totalSales) {
            // If total sales are equal, compare by last name then first name
            if (this.lastName.equals(otherSalesperson.lastName)) {
                return this.firstName.compareTo(otherSalesperson.firstName);
            } else {
                return this.lastName.compareTo(otherSalesperson.lastName);
            }
        } else {
            // If total sales are different, compare by total sales
            return otherSalesperson.totalSales - this.totalSales;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}