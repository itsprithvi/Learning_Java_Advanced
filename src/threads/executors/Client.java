package threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);


        for(int i=1; i<=100; i++) {

            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);

        }

        executorService.shutdown();
    }

}
