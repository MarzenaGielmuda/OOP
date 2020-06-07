package observer;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Subject subject = new Subject(client);
    }


}
