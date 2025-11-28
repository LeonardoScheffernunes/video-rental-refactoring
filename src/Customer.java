import java.util.*;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    // Refactoring 2: método amountFor com parâmetro renomeado para aRental
    private double amountFor(Rental aRental) {
        return aRental.getMovie().getCharge(aRental.getDaysRented());
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        for (Rental each : rentals) {

            frequentRenterPoints += each.getFrequentRenterPoints();

            double thisAmount = amountFor(each);

            result.append("\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n");

            totalAmount += thisAmount;
        }

        result.append("Amount owed is " + totalAmount + "\n");
        result.append("You earned " + frequentRenterPoints + " frequent renter points");

        return result.toString();
    }
}
