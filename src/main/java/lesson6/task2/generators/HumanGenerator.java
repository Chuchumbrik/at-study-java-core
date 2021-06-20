package lesson6.task2.generators;

import lesson6.task2.Chance;
import lesson6.task2.Human;
import lesson6.task2.PhoneType;

public class HumanGenerator {
    public static Human generate() {
        Human human = new Human();
        human.setAge(AgeGenerator.generate());
        human.setFirstName(NameGenerator.generate());
        human.setLastName(NameGenerator.generate());
        for (PhoneType pt : PhoneType.values()) {
            if (Chance.calculateChance(20)) {
                human.setPhones(pt, PhoneGenerator.generate());
            }
        }
        return human;
    }
}
