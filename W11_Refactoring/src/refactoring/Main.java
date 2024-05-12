package refactoring;

public class Main {
    public static void main(String[] args) {
        // Create movies
        Movie movie1 = new Movie("Movie 1", Movie.REGULAR);
        Movie movie2 = new Movie("Movie 2", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("Movie 3", Movie.CHILDRENS);

        // Create rentals
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 4);

        // Create customer
        Customer customer = new Customer("John Doe");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Print statement
        System.out.println(customer.statement());
        System.out.println(customer.htmlStatement());
    }
}
