package accessModifiers;

public class Student {
    private String name;
    String batchName;
    protected double psp;
    public String universityName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
