package solid_applied.srp;

public abstract class Order {
    private int id;
    private int customerId;
    private int productId;
    Payment payment;

    public Order(int id, int customerId, int productId) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
    }

    int price;
    public Payment getPayment() {
        return payment;
    }
}
