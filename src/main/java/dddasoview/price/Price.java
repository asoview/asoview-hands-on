package dddasoview.price;

import dddasoview.quantity.Quantity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Price {
    private BigDecimal price;

    public Price(BigDecimal price) {
        // XXX: assertで不正な値を弾く.
        assert price.compareTo(BigDecimal.ZERO) >= 0 : "price is too small.";
        this.price = price;
    }

    public Price divide(Quantity quantity) {
        return new Price(this.price.divide(BigDecimal.valueOf(quantity.intValue()), RoundingMode.CEILING));
    }

    @Override
    public String toString() {
        return new DecimalFormat().format(price);
    }
}
