package solid_violation.srp;

public abstract class Order {
    private int id;
    private int customerId;
    private int productId;
    public Order(int id, int customerId, int productId) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
    }
    public abstract void ship();
}
