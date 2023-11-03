package copyConstructor;

public class Student {
    int age;
    String name;

    private String univName;

    public Student(int age, String name, String univName) {
        this.age = age;
        this.name = name;
        this.univName = univName;
    }

    public Student(Student oldStudent) {
        this.age = oldStudent.age;
        this.name = oldStudent.name;
        this.univName = oldStudent.univName;
    }

    //university name
    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getUnivName() {
        return univName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
