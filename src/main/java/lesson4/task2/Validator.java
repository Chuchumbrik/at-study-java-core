package lesson4.task2;

public class Validator {
    private static final String TARGET = " ";

    public static boolean stringFormatValidator(String verifiable) {
        if (((verifiable.length() - verifiable.replace(TARGET, "").length()) / TARGET.length()) == 2) {
            getPrint("Валидный формат строки");
            return true;
        } else {
            getPrint("Не валидный формат строки");
            return false;
        }
    }

    public static String[] splittingStringArrayBySpaces(String separable) {
        return separable.split(" ");
    }

    private static void getPrint(String value) {
        System.out.println(value);
    }
}
