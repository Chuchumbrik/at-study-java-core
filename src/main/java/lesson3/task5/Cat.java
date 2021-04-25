package lesson3.task5;

import java.util.Random;

public class Cat {
    String name;
    int age;

    public Cat() {
        this.name = Names.getNameCat();
        this.age = new Random().nextInt(21);
    }

}
