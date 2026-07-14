package student;

public class Student {

    // two variables, registration number (int) and name (String)
    private int registration;
    private String name;

    // Student method that receives the arguments registration number and name
    public Student (int registration, String name) {

        // the value passed to the registration argument is defined in the registration variable of
        // the Student class
        this.registration = registration;

        // the value passed to the name argument is set in the name variable of the Student class
        this.name = name;
    }

    // getters and setters

    // when calling the getRegistration method, we get the value of the registration variable returned
    public int getRegistration() {
        return this.registration;
    }

    // when calling the setRegistration method, we pass an integer value as an argument,
    // this value is defined in the registration variable
    public void setRegistration(int registration) {
        this.registration = registration;
    }

    // when calling the getName method, we get the value of the variable name returned
    public String getName() {
        return this.name;
    }

    // when calling the setName method, we pass a String value as an argument,
    // this value is set in the variable name
    public void setName(String name) {
        this.name = name;
    }
}