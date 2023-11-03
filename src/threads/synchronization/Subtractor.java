package threads.synchronization;

import java.util.concurrent.Flow;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        //System.out.println("Subtractor thread is running...");
        for(int i=1; i<=100; i++) {
            //System.out.println(count.value);
            count.value -= i;
        }
    }
}
