package decorator;

import java.math.BigDecimal;

public class i400Car implements Car {
    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(45000);
    }

    @Override
    public String description() {
        return "Hyundai i400";
    }
}
