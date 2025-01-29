package WithoutStrategy;

public class Crocs extends Product{
    public Crocs(String name, int id, double price) {
        super(name, id, price);
    }

    @Override
    public double getDiscount() {
        return 0.15 * price;
    }
}
