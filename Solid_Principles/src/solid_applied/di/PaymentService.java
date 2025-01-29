package solid_applied.di;


import solid_applied.ocp.PayPalPaymentProcessor;
import solid_applied.ocp.Payment;
import solid_applied.ocp.PaymentProcessor;

public class PaymentService {
    public PaymentProcessor paymentProcessor;

    PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(Payment payment) {
        this.paymentProcessor.process(payment);
    }
}


/*
Decoupled the paypal processor and depending on the abstraction paymentProcessor
 */