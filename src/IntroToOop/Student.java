package IntroToOop;

public class Student {
    String name;
    String batchName;  // default
    double psp;
    String universityName;

    void changeBatch(String newBatch) {
        this.batchName = newBatch;
    }

    void giveMockInterview() {
        System.out.println("Giving Mock Interview...");
    }
}
