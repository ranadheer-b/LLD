package solid_violation.lsp.lsp_2;

import solid_violation.srp.Order;

public class PhysicalOrder extends Order {
    public PhysicalOrder(int id, int customerId, int productId) {
        super(id, customerId, productId);
    }

    @Override
    public void ship() {
        System.out.printf("shipping is taken care");
    }
}
