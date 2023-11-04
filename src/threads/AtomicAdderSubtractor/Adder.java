package threads.AtomicAdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private final Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        //System.out.println("Adder thread is running");
        for(int i=1; i<=100; i++) {
            count.value.addAndGet(i);
        }
    }
}
