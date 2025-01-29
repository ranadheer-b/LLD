package solid_applied.ocp;

import solid_applied.ocp.Payment;

import java.util.List;

public class PaymentService {
        private List<PaymentProcessor> processors;

        public void processPayment(Payment payment) {
            processors.forEach(p -> p.process(payment));
        }
}
