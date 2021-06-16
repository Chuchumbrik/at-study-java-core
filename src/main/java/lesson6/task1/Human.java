package lesson6.task1;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private String phone;

    public Human(String lastName, String firstName, int age, String phone) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

}
