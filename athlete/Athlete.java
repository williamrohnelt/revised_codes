package athlete;

public class Athlete {

    // atributes
    private String name;
    private int age;

    // default constructor
    public Athlete() {
    }

    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setters and getters methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (age <= 0) {
            System.out.println("Error");
        } else {
            age = i;
        }
    }
}