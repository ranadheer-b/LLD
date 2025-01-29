package solid_violation.isp;

public interface OrderOperations {
    void placeOrder();
    void cancelOrder();
    void processRefund();
}


/*
Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they do not use.
 */