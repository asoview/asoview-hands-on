package dddasoview.price.sale;

import dddasoview.price.Yen;
import dddasoview.quantity.SubscriptionQuantity;

public class PerSubscription {
    private Yen yen;

    public PerSubscription(Gross gross, SubscriptionQuantity subscriptionQuantity) {
        this.yen = gross.getYen().divide(subscriptionQuantity.getQuantity());
    }

    @Override
    public String toString() {
        return yen.toString();
    }
}
