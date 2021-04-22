package lesson2.task3;

import java.util.regex.Pattern;

public class PhoneTemplate {

    public static void main(String[] args) {
        PhoneTemplate phoneTemplate = new PhoneTemplate();
        System.out.println(phoneTemplate.checkingWithTemplate("+7(910)423-73-12"));
        System.out.println(phoneTemplate.checkingWithTemplate("7(910)423-73-12"));
        System.out.println(phoneTemplate.checkingWithTemplate("89215310934"));
        System.out.println(phoneTemplate.checkingWithTemplate("+5(911)310-12-74"));
        System.out.println(phoneTemplate.checkingWithTemplate("+7(9fg)125-42-99"));
        System.out.println(phoneTemplate.checkingWithTemplate("+7(122)2342343"));
        System.out.println(phoneTemplate.checkingWithTemplate("1+7(122)234-23-43"));
        System.out.println(phoneTemplate.checkingWithTemplate("+7(122)234-23-431"));

        System.out.println();

        System.out.println(phoneTemplate.checkingWithCycles("+7(910)423-73-12"));
        System.out.println(phoneTemplate.checkingWithCycles("7(910)423-73-12"));
        System.out.println(phoneTemplate.checkingWithCycles("89215310934"));
        System.out.println(phoneTemplate.checkingWithCycles("+5(911)310-12-74"));
        System.out.println(phoneTemplate.checkingWithCycles("+7(9fg)125-42-99"));
        System.out.println(phoneTemplate.checkingWithCycles("+7(122)2342343"));
        System.out.println(phoneTemplate.checkingWithCycles("1+7(122)234-23-43"));
        System.out.println(phoneTemplate.checkingWithCycles("+7(122)234-23-431"));

    }

    boolean checkingWithTemplate(String phone) {
        return Pattern.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$", phone);
    }

    boolean checkingWithCycles(String phone) {
        if (phone == null || phone.length() != 16)
            return false;

        if (phone.charAt(0) != '+')
            return false;
        if (phone.charAt(1) != '7')
            return false;

        if (phone.charAt(2) != '(')
            return false;

        if (phone.charAt(6) != ')')
            return false;
        if ((phone.charAt(10) != '-') && (phone.charAt(13) != '-'))
            return false;


        int[] idNumbers = {3, 4, 5, 7, 8, 9, 11, 12, 14 , 15};
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean flagOccurrences = false;
        for (int i = 0; i < idNumbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (phone.charAt(idNumbers[i]) == numbers[j]) {
                    flagOccurrences = true;
                }
            }
            if (!flagOccurrences) {
                return false;
            }
            flagOccurrences = false;
        }


        return true;
    }
}
