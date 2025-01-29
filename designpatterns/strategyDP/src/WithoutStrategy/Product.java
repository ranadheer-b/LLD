package WithoutStrategy;

public class Product {
    String name;
    int id;
    double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public double getDiscount(){
        return 0.10 * price;
    }


}
