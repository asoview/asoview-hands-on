package dddasoview.report;

import dddasoview.category.Category;
import dddasoview.price.sale.Gross;
import dddasoview.price.sale.PerSubscription;
import dddasoview.quantity.SubscriptionQuantity;

public class SalesPerCategory {
    private Category category;
    private SubscriptionQuantity subscriptionQuantity;
    private Gross gross;
    private PerSubscription perSubscription;

    public SalesPerCategory(Category category, SubscriptionQuantity subscriptionQuantity, Gross gross) {
        this.category = category;
        this.subscriptionQuantity = subscriptionQuantity;
        this.gross = gross;
        this.perSubscription = new PerSubscription(gross, subscriptionQuantity);
    }

    public String getCategory() {
        return category.toString();
    }

    public String getSubscriptionQuantity() {
        return subscriptionQuantity.getQuantity().toString();
    }

    public String getGross() {
        return gross.toString();
    }

    public String getPerSubscription() {
        return perSubscription.toString();
    }
}