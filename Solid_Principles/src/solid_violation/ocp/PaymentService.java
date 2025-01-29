package solid_violation.ocp;

import solid_applied.srp.Payment;

public class PaymentService {
    public void processPayment(Payment payment) {
        /* process payment */
        if (payment.getType().equals("CreditCard")) {
            // Process credit card payment
        } else if (payment.getType().equals("PayPal")) {
            // Process PayPal payment
        }
    }
}


/*
 Open/Closed Principle (OCP): A class should be open for extension but closed for modification.
 The payment logic is tightly coupled inside PaymentService, so any new payment method requires modifying the existing code.
 If there is a new payment method is added, this class will be modified again.
 */