package decorator;

import java.math.BigDecimal;

public class Airbags extends ToppingDecorator{

    public Airbags(Car newCar) {
        super(newCar);

        System.out.println("Add Airbags");
    }


    @Override
    public BigDecimal price() {
        return tempCar.price().add(BigDecimal.valueOf(5000));
    }

    @Override
    public String description() {
        return tempCar.description() + ", airbags";
    }
}
