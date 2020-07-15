/*
    Volatile won't stop deadlock, only can fix that another thread can see the variable in the thread
    it will stop the cashing
 */


import java.util.concurrent.atomic.AtomicBoolean;

public class TestVolatile {
    private static AtomicBoolean flag = new AtomicBoolean(false);

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 5000; i++){
                    System.out.println("Printing value" + i);
                    try{
                        Thread.sleep(1);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                flag = new AtomicBoolean(true);
            }
        }).start();

        new Thread(() -> {
            int i = 1;

            System.out.println("Job Ddone" + i);
        }).start();

    }
}
