package lesson6.task2.generators;

import java.util.Random;

public class NameGenerator {
    public static String generate() {
        final String CYRILLIC = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (new Random().nextInt(7) + 5); i++) {
            sb.append(CYRILLIC.charAt(new Random().nextInt(CYRILLIC.length())));
        }

        return sb.substring(0,1).toUpperCase() + sb.substring(1);
    }
}
