package WithStrategy;

public class Product {
    double price;
    DiscountStrategy productStrategy;

    Product(double price, DiscountStrategy productStrategy){
        this.price = price;
        this.productStrategy = productStrategy;
    }

    double getDiscount(){
       return this.productStrategy.getDiscount(price);
    }



}
