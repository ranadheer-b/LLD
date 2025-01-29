package WithStrategy;

public class Laptop extends Product{
    Laptop(double price,DiscountStrategy productStrategy) {
        super(price,productStrategy);
    }
}
