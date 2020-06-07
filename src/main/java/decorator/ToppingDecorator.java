package decorator;

import java.math.BigDecimal;

public abstract class ToppingDecorator implements Car {

    protected Car tempCar;

    public ToppingDecorator(Car newCar){
        tempCar = newCar;
    }

    public String getDescription(){
        return tempCar.description();
    }

    public BigDecimal getPrice(){
        return tempCar.price();
    }
}
