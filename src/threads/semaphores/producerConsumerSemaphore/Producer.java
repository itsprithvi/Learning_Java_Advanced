package threads.semaphores.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    Queue<Object> shirts;
    int maxSize;
    String name;
    Lock lock;
    Semaphore p;
    Semaphore c;

    public Producer(String name, Queue<Object> shirts, int maxSize, Semaphore p, Semaphore c) {
        this.name = name;
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.p = p;
        this.c = c;
    }

    @Override
    public void run() {
        while(true) {
            try {
                p.acquire();
                if(shirts.size() < maxSize) {
                    System.out.println(name + " is adding the object, size=" +shirts.size());
                    shirts.add(new Object());
                }
                c.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
