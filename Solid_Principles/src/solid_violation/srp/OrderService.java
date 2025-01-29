package solid_violation.srp;

public class OrderService {
    public void placeOrder(Order order) { /* process order */ }
    public void processPayment(Payment payment) { /* process payment */ }
    public void sendNotification(String message) { /* send email */ }
}


/*
`   Single Responsibility Principle: Each class should have only one reason to change
    In the above example, it does not follow SRP. As the class will change whenever there
    is change in either of the three methods i.e, placeOrder, processPayment, sendNotification
    If there is a new payment method like COD added to the payment process, this class needs to change
    If there is a new notification method like slack has been added, this class will change
 */