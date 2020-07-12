import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

    private final BlockingQueue taskQueue;
    private final List<PoolThread> threads = new ArrayList<>();

    ThreadPool(int numOfThreads, int maxNumOfTasks){
        this.taskQueue = new ArrayBlockingQueue<Runnable>(maxNumOfTasks);
        for(int i = 0; i < numOfThreads; i++){
            this.threads.add(new PoolThread(taskQueue));
        }
        for(PoolThread thread: threads){
            thread.start();
        }
    }

    synchronized void execute(Runnable task){
        this.taskQueue.offer(task);
    }

}
