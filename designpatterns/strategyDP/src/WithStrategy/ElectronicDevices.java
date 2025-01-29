package WithStrategy;

public class ElectronicDevices implements DiscountStrategy {
    @Override
    public double getDiscount(double price) {
        return 0.3 * price;
    }
}
