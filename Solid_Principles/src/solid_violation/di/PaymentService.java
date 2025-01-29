package solid_violation.di;

public class PaymentService {
    public PayPalPaymentProcessor paymentProcessor;

    PaymentService() {
        this.paymentProcessor = new PayPalPaymentProcessor();
    }

    public void processPayment(Payment payment) {
        this.paymentProcessor.process(payment);
    }
}


/*
Dependency Inversion Principle: High-level modules should not depend on low-level modules; both should depend on abstraction
Here Payment Service is a high level module and PayPalPaymentProcessor is a low level module. It is tightly coupled with
the paypal payment making it difficult to introduce new payment methods.
It needs to depend on the payment abstraction class instead.
If we want to support CreditCard or UPI, we need to modify PaymentService, violating Open-Closed Principle (OCP).
 */