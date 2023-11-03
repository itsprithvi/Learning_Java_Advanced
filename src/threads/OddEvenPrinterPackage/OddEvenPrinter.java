package threads.OddEvenPrinterPackage;

public class OddEvenPrinter implements Runnable{

    int max;
    private final Object lock = new Object();
    private final Number number;

    public OddEvenPrinter(int max, Number number) {
        this.max = max;
        this.number = number;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (number) {
                if(number.getNumber() > max) break;

                String threadName = Thread.currentThread().getName();

                if(number.getNumber()%2 != 0 && threadName.equals("oddThread")) {
                    System.out.println("Odd Thread :  " +number.getNumber());
                    number.incNumber();
                }
                else if(number.getNumber()%2 == 0 && threadName.equals("evenThread")) {
                    System.out.println("Even Thread : " +number.getNumber());
                    number.incNumber();
                }
            }
        }
    }
}
