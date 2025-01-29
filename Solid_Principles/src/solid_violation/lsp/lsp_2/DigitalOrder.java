package solid_violation.lsp.lsp_2;

import solid_violation.srp.Order;

public class DigitalOrder extends Order {
    public DigitalOrder(int id, int customerId, int productId) {
        super(id, customerId, productId);
    }

    @Override
    public void ship() {
        throw new UnsupportedOperationException("Digital products cannot be shipped");
    }
}


