package dddasoview.price.sale;

import dddasoview.price.Yen;
import dddasoview.quantity.SubscriptionQuantity;

public class Gross {
    private Yen yen;

    public Gross(Yen yen) {
        this.yen = yen;
    }

    public PerSubscription divide(SubscriptionQuantity subscriptionQuantity) {
        // XXX: Grossを購入量で割ることができるが、その実際の処理方法PerSubscriptionの知識と判断してコンストラクタに委譲した.
        return new PerSubscription(this, subscriptionQuantity);
    }

    public Yen getYen() {
        return yen;
    }

    @Override
    public String toString() {
        return yen.toString();
    }
}
