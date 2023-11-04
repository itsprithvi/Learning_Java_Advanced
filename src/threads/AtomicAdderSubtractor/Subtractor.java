package threads.AtomicAdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    Lock lock;

    public Subtractor(Count count) {
        this.count = count;
    }



    @Override
    public void run() {
        //System.out.println("Subtractor thread is running...");
        for(int i=1; i<=100; i++) {
            count.value.addAndGet(-i);
        }
    }
}