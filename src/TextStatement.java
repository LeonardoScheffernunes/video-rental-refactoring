import java.util.Enumeration;

public class TextStatement extends Statement {
    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    protected String eachRental(Customer aCustomer) {
        String result = "";
        Enumeration<Rental> rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }
        return result;
    }

    protected String footer(Customer aCustomer) {
        return "Amount owed is " + aCustomer.getTotalCharge() + "\n" +
               "You earned " + aCustomer.getTotalFrequentRenterPoints() + " frequent renter points";
    }
}
