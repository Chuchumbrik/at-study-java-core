package lesson4.task4;

public class Application {

    public static void main(String[] args) {

        Passport passportCorrect = new Passport().setSeries("1234").setNumbers("123456");
        System.out.println();

        Passport passportIncorrect1 = new Passport().setSeries("123").setNumbers("12345");
        System.out.println();

        Passport passportIncorrect2 = new Passport().setSeries("12345").setNumbers("1234567");
        System.out.println();

        Passport passportIncorrect3 = new Passport().setSeries("").setNumbers("");
        System.out.println();

        Passport passportIncorrect4 = new Passport().setSeries("0000").setNumbers("");
        System.out.println();

        Passport passportIncorrect5 = new Passport().setSeries("").setNumbers("444444");
        System.out.println();

        Human human = new Human();
        human.setFirstName("Adasdq").setLastName("Фывфыа").setAge(123);
        human.setPassport(passportCorrect);
        System.out.println();

        Human human1 = new Human();
        human1.setFirstName("Adasdq").setLastName("Фывфыа").setAge(123);
        human1.setPassport(passportIncorrect3);
        human1.setPassport(passportIncorrect4);
        human1.setPassport(passportIncorrect5);
        System.out.println();

        Passport passport1 = new Passport().setSeries("1234");
        System.out.println();

        Passport passport2 = new Passport().setSeries("1234");
        System.out.println();

        Stash.getPassports();
    }
}
