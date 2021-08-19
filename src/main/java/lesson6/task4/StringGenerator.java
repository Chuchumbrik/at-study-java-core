package lesson6.task4;

import java.util.Random;

public class StringGenerator {
    public static String generate(String template) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < template.length(); i++) {
            char charTemplate = template.charAt(i);
            switch (charTemplate) {
                case ('9'):
                    result.append(randomNumber());
                    break;
                case ('Б'):
                    result.append(randomCyrillicChar());
                    break;
                case ('S'):
                    if (new Random().nextInt(2) == 0) {
                        result.append(randomNumber());
                    } else {
                        result.append(randomCyrillicChar());
                    }
                    break;
                case ('0'):
                    if (new Random().nextInt(2) == 0) {
                        result.append(randomNumber());
                    }
                    break;
                case (' '):
                    result.append(" ");
                    break;
            }
        }

        return result.toString();
    }

    private static int randomNumber() {
        return new Random().nextInt(10);
    }

    private static char randomCyrillicChar() {
        final String CYRILLIC = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        return CYRILLIC.charAt(new Random().nextInt(CYRILLIC.length()));
    }
}
