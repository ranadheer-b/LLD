package WithoutStrategy;

public class Mobile extends Product{
    public Mobile(String name, int id, double price) {
        super(name, id, price);
    }

    @Override
    public double getDiscount() {
        return 0.3 * price;
    }
}
