package threads.adderSubtractorMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    Lock lock;
    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        //System.out.println("Adder thread is running");
        for(int i=1; i<=100; i++) {
            //System.out.println(count.value);
            lock.lock();
            count.value += i;
            lock.unlock();
        }
    }
}
