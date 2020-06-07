package observer;

public class Client2 implements Observer {
    public void update() {
        System.out.println("End of work!!" + this.getClass().getName());

    }

    @Override
    public void sendData(String info) {
        System.out.println(this.getClass().getName() + " " + info);

    }
}