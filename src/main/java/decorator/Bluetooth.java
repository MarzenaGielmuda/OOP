package decorator;

import java.math.BigDecimal;

public class Bluetooth extends ToppingDecorator {

    public Bluetooth(Car newCar) {
        super(newCar);

        System.out.println("Add Bluetooth");
    }

    @Override
    public BigDecimal price() {
        return tempCar.price().add(BigDecimal.valueOf(1000));
    }

    @Override
    public String description() {
        return tempCar.description() + ", bluetooth";
    }
}
