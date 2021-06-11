package lesson4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Human {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public void setFirstName(String firstName) {
        String result = validationName(firstName);
        if (result.contains("error")) {
            setIncorrectPrint(firstName);
        } else {
            this.firstName = firstName;
            setCorrectPrint("имени", firstName);
        }
    }

    public void setLastName(String lastname) {
        String result = validationName(lastname);
        if (result.contains("error")) {
            setIncorrectPrint(lastname);
        } else {
            this.lastName = lastname;
            setCorrectPrint("фамилии", lastname);
        }
    }

    public void setBirthDate(Date birthDate) {
        Date today = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");

        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrint("даты рождения", dateFormatter.format(birthDate));
        } else {
            setIncorrectPrint(dateFormatter.format(birthDate));
        }
    }

    public String getFirstName() {
        if (this.firstName != null) {
            return this.firstName;
        } else {
            return "firstName - не установлен";
        }
    }

    public String getLastName() {
        if (this.lastName != null) {
            return this.lastName;
        } else {
            return "lastname - не установлен";
        }
    }

    public Date getBirthDate() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
        String date = birthDate != null
                ? dateFormatter.format(birthDate)
                : null;
        getPrint("даты рождения", date);
        return birthDate;
    }

    String validationName(String name) {
        if (name.length() < 3)
            return "error - содержит меньше 3 символов";
        if (!Pattern.matches("[а-яёА-ЯЁ]+", name))
            return "error - содержит не только кирилицу";
        if (!Pattern.matches("^[А-Я][а-я]+$", name))
            return "error - первый сивмол не заглавный или все остальные символы не строчные";
        return name;
    }

    private void getPrint(String type, String value) {
        System.out.printf("Получено значение %s: %s%n", type, value);
    }

    private void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Введенное значение некорректно: %s%n", value);
    }
}
