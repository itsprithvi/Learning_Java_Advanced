package threads;

public class Client {

    public static void main(String[] args) {

//        System.out.println("Hello World Printed by thread : " +Thread.currentThread().getName());
//
//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//
//        Thread thread = new Thread(hwp);
//
//        thread.start();
//
//        System.out.println("Before end again print by thread : " +Thread.currentThread().getName());

        for(int i=0; i<=9; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);

            thread.start();
        }










    }

}
