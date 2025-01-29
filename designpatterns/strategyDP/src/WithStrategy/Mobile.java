package WithStrategy;

public class Mobile extends Product{
    Mobile(double price,DiscountStrategy productStrategy) {
        super(price,productStrategy);
    }

}
