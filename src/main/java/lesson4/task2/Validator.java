package lesson4.task2;

public class Validator {

    public static String stringFormatValidator(String verifiable) {
        String target = " ";

        if (((verifiable.length() - verifiable.replace(target, "").length()) / target.length()) == 2) {
            return "Валидный формат строки";
        } else {
            return "Не валидный формат строки";
        }
    }

    public static String[] splittingStringArrayBySpaces(String separable) {
        return separable.split(" ");
    }
}
