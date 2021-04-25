package lesson3.task5;

import java.util.Random;

public class Dog {
    String name;
    int age;

    public Dog() {
        this.name = Names.getNameDog();
        this.age = new Random().nextInt(21);
    }
}
