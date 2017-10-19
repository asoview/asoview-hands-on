package dddasoview.price;

import dddasoview.quantity.Quantity;

public class Yen {
    private Price price;

    public Yen(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "¥" + price.toString();
    }

    public Yen divide(Quantity quantity) {
        return new Yen(price.divide(quantity));
    }
}
