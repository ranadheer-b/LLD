package WithoutStrategy;

public class Laptop  extends Product{
    public Laptop(String name, int id, double price) {
        super(name, id, price);
    }

    @Override
    public double getDiscount() {
        return 0.3 * price;
    }
}
