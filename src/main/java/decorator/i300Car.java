package decorator;

import java.math.BigDecimal;

public class i300Car implements Car {
    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(35000);
    }

    @Override
    public String description() {
        return "Hyundai i300";
    }
}
