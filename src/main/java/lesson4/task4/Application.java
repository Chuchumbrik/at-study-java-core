package lesson4.task4;

import lesson4.task1.Human;

public class Application {
    public static void main(String[] args) {
        Human test1 = new Human();
        System.out.println(test1.setFirstName("Фывп1"));
        System.out.println(test1.setLastName("Ааааа"));
        System.out.println(test1.getFirstName());
        System.out.println(test1.getLastName());
        test1.setBirthDate("12.12.1212a");
    }
}
