package lesson3.task5;

import java.util.Random;

public class Names {
    static String[] namesHuman = {"Ольга", "Петр", "Даниил"};
    static String[] namesCat = {"Булька", "Приход", "Платон"};
    static String[] namesDog = {"Рекс", "Дара", "Пиндос"};

    static String getNameHuman(){
        return namesHuman[new Random().nextInt(namesHuman.length)];
    }

    static String getNameDog(){
        return namesDog[new Random().nextInt(namesHuman.length)];
    }

    static String getNameCat(){
        return namesCat[new Random().nextInt(namesHuman.length)];
    }
}
