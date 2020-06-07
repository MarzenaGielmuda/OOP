package fasada.delivery;

class DeliveryBox {
    boolean isDeliveryBoxFull(){
        System.out.println("Delivery Box isn't full");
        return false;
    }

    boolean isDeliveryBoxBroken(){
        System.out.println("Delivery Box isn't broken");
        return false;
    }

    void getUserData(){
        System.out.println("User data entered");
    }

    void openBox(){
        System.out.println("Box is open");
    }
}
