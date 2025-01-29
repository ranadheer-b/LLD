package WithStrategy;

public class Crocs extends Product{
    Crocs(double price,DiscountStrategy productStrategy) {
        super(price,productStrategy);
    }
}
