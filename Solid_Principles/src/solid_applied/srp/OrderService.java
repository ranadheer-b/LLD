package solid_applied.srp;

public class OrderService {

    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public OrderService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void placeOrder(Order order) {
        // Process order
        paymentService.processPayment(order.getPayment());
        notificationService.sendNotification("Order placed successfully!");
    }
}
