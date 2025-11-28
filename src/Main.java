public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Leonardo");
        Movie matrix = new Movie("Matrix", Movie.REGULAR);
        Movie toyStory = new Movie("Toy Story", Movie.CHILDRENS);
        Movie avengers = new Movie("Avengers", Movie.NEW_RELEASE);

        customer.addRental(new Rental(matrix, 3));
        customer.addRental(new Rental(toyStory, 2));
        customer.addRental(new Rental(avengers, 2));

        System.out.println(customer.statement());
        System.out.println(customer.htmlStatement());
    }
}
