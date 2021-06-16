package lesson6.task1.generators;

import java.util.Random;

public class NameGenerator {
    public static String generate() {
        final String CYRILLIC = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Random ran = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < (ran.nextInt(7) + 5); i++) {
           char append = CYRILLIC.charAt(ran.nextInt(CYRILLIC.length()));
            stringBuilder.append(append);
        }
        return stringBuilder.substring(0, 1).toUpperCase() + stringBuilder.substring(1);
    }
}
