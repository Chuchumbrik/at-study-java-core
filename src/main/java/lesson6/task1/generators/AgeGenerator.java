package lesson6.task1.generators;

import java.util.Random;

public class AgeGenerator {
    public static int generate() {
        return (new Random().nextInt(55) + 20);
    }
}
