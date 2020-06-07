package observer;

public class Subject {

    public Subject(final Observer observer){

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
                observer.update();
            }
        });
        thread.start();
    }


}
