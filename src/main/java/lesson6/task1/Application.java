package lesson6.task1;

import lesson6.task1.generators.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Human> listHumans = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            listHumans.add(new Human(NameGenerator.generate(), NameGenerator.generate(), AgeGenerator.generate(), PhoneGenerator.generate()));
        }

        for(Human human : listHumans) {
            if (human.getAge() == 35) {
                System.out.printf("%s %s, возраст %d, тел. %s.%n", human.getLastName(), human.getFirstName(), human.getAge(), human.getPhone());
            }
        }
    }
}
