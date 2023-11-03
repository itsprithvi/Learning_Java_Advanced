package threads.OddEvenPrinterPackage;

public class Client {
    public static void main(String[] args) {
        Number number = new Number();
        OddEvenPrinter oddEvenPrinter = new OddEvenPrinter(100, number);

        Thread threadOdd = new Thread(oddEvenPrinter, "oddThread");
        Thread threadEven = new Thread(oddEvenPrinter, "evenThread");


        threadOdd.start();
        threadEven.start();

    }
}
