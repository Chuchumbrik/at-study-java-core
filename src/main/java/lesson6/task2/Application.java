package lesson6.task2;

import lesson6.task2.generators.HumanGenerator;
import java.util.HashSet;


public class Application {
    public static void main(String[] args) {
        HashSet<Human> humanHashSet = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            humanHashSet.add(HumanGenerator.generate());
        }

        for ( Human s : humanHashSet ) {
            if (s.getPhone().size() == 3) {
                System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getAge()  + " " + s.getPhone());
            }
        }

        humanHashSet.removeIf(s -> s.getPhone().size() > 0);

        for ( Human s : humanHashSet ) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getAge()  + " " + s.getPhone());
        }
    }
}
