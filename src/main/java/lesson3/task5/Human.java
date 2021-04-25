package lesson3.task5;

import java.util.Random;

public class Human {
    String name;
    Cat[] cats = new Cat[3];
    Dog[] dogs = new Dog[3];

    public Human(){
        this.name = Names.getNameHuman();
        int quantityAnimals = new Random().nextInt(3);
        for (int i = 0; i < quantityAnimals; i++) {
            int random = new Random().nextInt(2);
            if (random == 1) {
                for (int j = 0; j < this.cats.length; j++) {
                    if (this.cats[j] == null) {
                        this.cats[j] = new Cat();
                        break;
                    }
                }
            } else {
                for (int j = 0; j < this.dogs.length; j++) {
                    if (this.dogs[j] == null) {
                        this.dogs[j] = new Dog();
                        break;
                    }
                }
            }
        }
    }
}
