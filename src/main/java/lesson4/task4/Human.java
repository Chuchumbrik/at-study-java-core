package lesson4.task4;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Passport passport;

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    public Passport getPassport() { return passport; }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        System.out.printf("Успешно: установлено lastName со значением - %s%n", this.lastName);
        return this;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.printf("Успешно: установлено firstName со значением - %s%n", this.firstName);
        return this;
    }

    public Human setAge (int age) {
        this.age = age;
        System.out.printf("Успешно: установлено age со значением - %d%n", this.age);
        return this;
    }

    public Human setPassport(Passport passport) {
        if (passport == null) {
            System.out.println("Ошибка: не удалось прикрепить паспорт");
            return this;
        }
        if (passport.getNumbers() == null || passport.getSeries() == null) {
            System.out.printf("Ошибка: не удалось прикрепить паспорт с серией - %s и номером %s%n", passport.getSeries(), passport.getNumbers());
            return this;
        }

        this.passport = passport;
        System.out.printf("Успешно: паспорт(%s, %s) успешно прикреплен к человеку %s %s %d%n", passport.getSeries() ,passport.getNumbers(), this.firstName, this.lastName, this.age);
        return this;
    }

}
