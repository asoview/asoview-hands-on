package dddasoview.quantity;

public class SubscriptionQuantity {
    private Quantity quantity;

    public SubscriptionQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return quantity.toString();
    }
}
