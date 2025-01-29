package WithoutStrategy;

public class Shoe extends Product{
    public Shoe(String name, int id, double price) {
        super(name, id, price);
    }

    @Override
    public double getDiscount() {
        return 0.15 * price;
    }

}
