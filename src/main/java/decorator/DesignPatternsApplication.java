package decorator;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        Car basicCar = new Airbags(new Bluetooth(new i200Car()));

        System.out.println("Ingredients : "+ basicCar.description());
        System.out.println("Price :" + basicCar.price());

    }


}
