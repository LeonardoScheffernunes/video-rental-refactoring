public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // método genérico para pontos frequentes
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
