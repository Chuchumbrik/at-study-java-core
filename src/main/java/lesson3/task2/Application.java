package lesson3.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat(2, 5, "Барсик"),
                new Cat(3, 11, "Мурзик"),
                new Cat(7, 2, "Матильда"),
                new Cat(1, 3, "Леопольд"),
                new Cat(11, 4, "Базилио")
        };

        String[] names = new String[cats.length];
        for (int i = 0; i < cats.length; i++) {
            names[i] = cats[i].name;
        }
        Arrays.sort(names);


        for (String name: names){
            for (Cat cat : cats) {
                if (cat.name.contains(name)) {
                    System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", cat.name, cat.age, cat.weight);
                    break;
                }
            }
        }

    }
}
