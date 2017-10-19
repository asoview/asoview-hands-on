package dddasoview.quantity;

import java.text.NumberFormat;

public class Quantity {
    private Integer quantity;

    public Quantity(Integer quantity) {
        assert quantity >= 0 : "quantity is too small.";
        this.quantity = quantity;
    }

    public Integer intValue() {
        return quantity;
    }

    @Override
    public String toString() {
        return NumberFormat.getNumberInstance().format(quantity);
    }
}
