package decorator;

import java.math.BigDecimal;

public class i200Car implements Car {
    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(30000);
    }

    @Override
    public String description() {
        return "Hyundai i200";
    }
}
