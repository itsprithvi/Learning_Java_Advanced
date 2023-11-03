package threads.adderSubtractorThirdParty;

public class Subtractor implements Runnable{
    private Count count;
//    Lock lock;

    public Subtractor(Count count) {
        this.count = count;
//        this.lock = lock;
    }



    @Override
    public void run() {
        //System.out.println("Subtractor thread is running...");
        for(int i=1; i<=100; i++) {

            synchronized (count) {
                count.incrementValue(-i);
            }

        }
    }
}