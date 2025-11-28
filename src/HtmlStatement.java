import java.util.Enumeration;

public class HtmlStatement extends Statement {
    protected String header(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    protected String eachRental(Customer aCustomer) {
        String result = "";
        Enumeration<Rental> rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "<BR>\n";
        }
        return result;
    }

    protected String footer(Customer aCustomer) {
        return "<P>You owe <EM>" + aCustomer.getTotalCharge() + "</EM><P>\n" +
               "On this rental you earned <EM>" + aCustomer.getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
    }
}
