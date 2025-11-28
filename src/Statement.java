public abstract class Statement {
    public String value(Customer aCustomer) {
        String result = header(aCustomer);
        result += eachRental(aCustomer);
        result += footer(aCustomer);
        return result;
    }

    protected abstract String header(Customer aCustomer);
    protected abstract String eachRental(Customer aCustomer);
    protected abstract String footer(Customer aCustomer);
}
