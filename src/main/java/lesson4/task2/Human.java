package lesson4.task2;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class Human {
    String lastName;
    String firstName;
    Date birthDate;

    private static final String NAME_REGEX = "^[А-Я][а-я]{2,}$";
    private static final String DATE_REGEX = "\\d{2}.\\d{2}.\\d{4}";

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    private static final String LAST_NAME = "фамилии";
    private static final String FIRST_NAME = "имени";
    private static final String BIRTH_DATE = "даты рождения";

    public boolean setFirstName(String firstName) {
        if (Pattern.matches(NAME_REGEX, firstName)) {
            this.firstName = firstName;
            setCorrectPrint(FIRST_NAME, this.firstName);
            return true;
        } else {
            setIncorrectPrint(FIRST_NAME, firstName);
            return false;
        }
    }

    public boolean setLastName(String lastName) {
        if (Pattern.matches(NAME_REGEX, lastName)) {
            this.lastName = lastName;
            setCorrectPrint(LAST_NAME, this.lastName);
            return true;
        } else {
            setIncorrectPrint(LAST_NAME, lastName);
            return false;
        }
    }

    public boolean setBirthDate(String birthString) throws ParseException {
        Date today = new Date();
        if (!Pattern.matches(DATE_REGEX, birthString)) {
            setIncorrectPrint(BIRTH_DATE, birthString);
            return false;
        }
        Date birthDate = DATE_FORMAT.parse(birthString);

        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrint(BIRTH_DATE, DATE_FORMAT.format(this.birthDate));
            return true;
        } else {
            setIncorrectPrint(BIRTH_DATE, DATE_FORMAT.format(birthDate));
            return false;
        }
    }

    public String getFirstName() {
        getPrint(FIRST_NAME, this.firstName);
        return this.firstName;
    }

    public String getLastName() {
        getPrint(LAST_NAME, this.lastName);
        return this.lastName;
    }

    public Date getBirthDate() {
        getPrint(BIRTH_DATE, DATE_FORMAT.format(this.birthDate));
        return this.birthDate;
    }

    private void getPrint(String type, String value) {
        System.out.printf("Получено значение %s: %s%n", type, value);
    }

    private void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    private void setIncorrectPrint(String type, String value) {
        System.out.printf("Введенное значение некорректно %s: %s%n", type, value);
    }

}
