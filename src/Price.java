public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // Passo 6: mover cálculo de pontos frequentes
    public int getFrequentRenterPoints(int daysRented) {
        // implementação padrão: 1 ponto
        return 1;
    }
}
