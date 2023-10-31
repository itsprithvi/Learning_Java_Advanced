package IntroToOop;

public class Client {
    public static void main(String[] args) {

        Student saloni = new Student();

        saloni.name = "Saloni";
        saloni.universityName = "Scaler Tech University";
        saloni.batchName = "LLD Jule 2023";
        saloni.psp = 73;

        System.out.println(saloni.name);


        Student manoj = new Student();

        manoj.name = "Manoj";
        manoj.universityName = "Scaler Tech University";
        manoj.batchName = "LLD Jule 2023";
        manoj.psp = 73;

        System.out.println(manoj.name);

    }
}
