package WithStrategy;

public class Shoe extends Product{
    Shoe(double price,DiscountStrategy productStrategy) {
        super(price,productStrategy);
    }
}
