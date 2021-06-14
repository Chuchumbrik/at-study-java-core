package lesson4.task2;

import java.text.ParseException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws ParseException {
        Human[] humans = new Human[3];
        for (int i = 0; i < 3; i++) {
            humans[i] = new Human();
        }

        boolean flag;
        Scanner in = new Scanner(System.in);
        String asd;
        for (Human human : humans) {
            flag = true;
            while (flag) {
                System.out.println("Введите Имя, Фамилию и Дату рождения(dd.MM.yyyy) через пробел");
                asd = in.nextLine();
                if (!Validator.stringFormatValidator(asd)) {
                    continue;
                }
                String[] split = Validator.splittingStringArrayBySpaces(asd);

                if (!human.setFirstName(split[0])) {
                    continue;
                }
                if (!human.setLastName(split[1])) {
                    continue;
                }
                if (!human.setBirthDate(split[2])) {
                    continue;
                }

                flag = false;
            }
        }
    }
}
