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

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        for (Rental each : rentals) {

            frequentRenterPoints += each.getFrequentRenterPoints();

            double thisAmount = each.getCharge();  // ← atualizado

            result.append("\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n");

            totalAmount += thisAmount;
        }

        result.append("Amount owed is " + totalAmount + "\n");
        result.append("You earned " + frequentRenterPoints + " frequent renter points");

        return result.toString();
    }
}
