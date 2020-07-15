import java.util.concurrent.Callable;
/*

Scheduling： 定时器
i. Cooperative: thread 之间合作关系，直到他完成。
cons：可能某个process挂掉了，就卡住了。
pros: it is much cheaper and faster than others

ii. Preemptive: 给一个time， 出现times out 转到下一个进程
cons: it is necessity to store and restore the state that the interrupted task had

Threading Model：

Kernel-level: 1:1 Model(Kernel-Level)
User-level: N:1 Model(User-Level)
M:N Model(Hybrid Threading)

Memory Model:
Memory object Thread-safe
i. lock
ii. mutexes

Thread LifeCycle
Priority
Stop Thread
主线程中止其他线程容易在中间拦住，操作到一般中止
run其实是一个life cycle
Join thread
Hibernate thread module


 */

public class MultithreadI {
    public static void main(String[] args) {
//        MyThread m1 = new MyThread();
//        m1.start();
//        MyRunnable m2 = new MyRunnable();
//        Thread t1 = new Thread(m2);
//        t1.start();
//        MyRunnable r1 = new MyRunnable(1);
//        MyRunnable r2 = new MyRunnable(2);
//
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();

          MyThread m1 = new MyThread(1);
          MyThread m2 = new MyThread(2);
          m1.start();
          try{
              m1.join();
          } catch (InterruptedException e){
              e.printStackTrace();
          }
          m2.start();
//          m1.interrupt();
        System.out.println("Thread names are following");
        System.out.println(m1.getName());
        System.out.println(m2.getName());
        System.out.println("Main completed!");
    }
}

class MyThread extends Thread{
    private Integer nThread;
    public MyThread(Integer nThread){
        this.nThread = nThread;
    }

    public void run(){
        System.out.println("thread" + nThread +"is running...");
        for(int i = 0; i < 5; i++){
            System.out.println("thread Id:" + nThread);
//            if(Thread.currentThread().isInterrupted()){
//                System.out.println("[Interruption Resoinsive Thread] is interrupted.");
//                break;
//            }
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }

    }


}

class MyRunnable implements Runnable{
    private Integer nThread;
    @Override
    public void run(){
        System.out.println("thread" + nThread + "is running...");
        System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
    }
    public MyRunnable(Integer nThread){
        this.nThread = nThread;
    }

}

