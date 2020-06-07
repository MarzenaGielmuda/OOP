package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Subject {

    public List<Observer> getObservers() {
        return observers;
    }

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void removeSubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    private List <Observer> observers;

    public Subject(){
        observers = new ArrayList<Observer>();
    }

    public void startWork(){

        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i =0; i < 100; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                for (Observer observer : observers){
                    observer.sendData(UUID.randomUUID().toString());
                }
            }
        });
        thread.start();
    }


}
