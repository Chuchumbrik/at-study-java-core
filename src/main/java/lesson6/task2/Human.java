package lesson6.task2;

import lesson6.task2.PhoneType;
import java.util.HashMap;

public class Human {
    String lastName;
    String firstName;
    int age;
    HashMap<PhoneType, String> phones = new HashMap<>();

    public HashMap<PhoneType, String> getPhone() {
        return phones;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhones(PhoneType pt, String phone) {
        this.phones.put(pt, phone);
    }
}
