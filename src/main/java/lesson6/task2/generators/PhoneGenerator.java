package lesson6.task2.generators;

import java.util.Random;

public class PhoneGenerator {
    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", generateNumber(3), generateNumber(3), generateNumber(2), generateNumber(2));
    }

    private static String generateNumber(int numberOfDigits) {
        final String NUMBER = "0123456789";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfDigits; i++) {
            sb.append(NUMBER.charAt(new Random().nextInt(NUMBER.length())));
        }
        return sb.toString();
    }
}
