package lesson6.task1.generators;

import java.util.Random;

public class PhoneGenerator {
    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", numberStringGenerator(3), numberStringGenerator(3), numberStringGenerator(2), numberStringGenerator(2));
    }

    private static String numberStringGenerator(int numberOfDigits) {
        final String NUMBER = "0123456789";
        Random ran = new Random();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfDigits; i++) {
            stringBuilder.append(NUMBER.charAt(ran.nextInt(NUMBER.length())));
        }

        return stringBuilder.toString();
    }
}
