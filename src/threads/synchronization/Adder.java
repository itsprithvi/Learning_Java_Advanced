package threads.synchronization;

public class Adder implements Runnable{
    private Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        //System.out.println("Adder thread is running");
        for(int i=1; i<=100; i++) {
            //System.out.println(count.value);
            count.value += i;
        }
    }
}
