import java.util.concurrent.locks.ReentrantLock;

/*
Race Condition
A concurrent application's ability to be executed by two thread
solution 1:
i. synchronized statement
ii. synchronized method (会出现问题，偏爱lock整个block）
solution 2:
lock interface
use lock instead of sleep
.lock
.trylock (不等待）
.unlock

reentrantLock: 最常用的

 */
public class RaceCondition implements Runnable {
    int c = 0;
    private Object mutex = new Object();
    private Object mutex1 = new Object();
    private ReentrantLock couterLock = new ReentrantLock(true);
    public void increment(){
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
//        couterLock.lock();
        c++;
        System.out.println("Value for Thread After increment " +
                Thread.currentThread().getName() + " " +
                this.getValue());
    }

    public void decrement(){
        c --;
        System.out.println("Value for Thread After increment " +
                Thread.currentThread().getName() + " " +
                this.getValue());
//        couterLock.unlock();
    }

    public int getValue(){
        return c;
    }

    @Override
    public void run() {
        couterLock.lock();
        this.increment();
        this.decrement();
        couterLock.unlock();
        System.out.println("Value for Thread at last"
        + Thread.currentThread().getName() + " " + this.getValue());
    }

    public static void main(String[] args) {
        RaceCondition counter = new RaceCondition();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        t1.start();
        t2.start();
    }
}


