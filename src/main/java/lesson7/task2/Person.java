package lesson7.task2;

import lesson6.task4.NameGenerate;

public class Person {
    String secondName;
    String firstName;

    public Person() {
        this.secondName = NameGenerate.generate();
        this.firstName = NameGenerate.generate();
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




}
