package copyConstructor;

public class Client {
    public static void main(String[] args) {

        Student st1 = new Student(12, "prithvi", "Scaler");

        Student st2 = new Student(st1);    // shallow copy, coz only values are getting copied

        Student st3 = st1;     // deep copy, means address will be same for both these

    }
}
