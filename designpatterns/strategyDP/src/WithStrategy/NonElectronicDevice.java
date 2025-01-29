package WithStrategy;

public class NonElectronicDevice implements DiscountStrategy {
    @Override
    public double getDiscount(double price) {
        return 0.15 * price;
    }
}
