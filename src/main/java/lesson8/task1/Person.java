package lesson8.task1;

import lesson6.task4.NameGenerate;

import java.util.Objects;
import java.util.Random;

public class Person {
    String firstName;
    String secondName;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Person() {
        this.firstName = NameGenerate.generate() + "-" + new Random().nextInt(21);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                secondName.equals(person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    @Override
    public String toString() {
        return "Фамилия: " + secondName + " ,Имя: " + firstName;
    }
}
