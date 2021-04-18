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

    }

    boolean checkingWithTemplate(String phone) {
        return Pattern.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$", phone);
    }
}
