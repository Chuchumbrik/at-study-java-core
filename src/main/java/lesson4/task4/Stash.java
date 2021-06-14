package lesson4.task4;

public class Stash {
    private static final Passport[] BD_PASSPORTS = new Passport[20];
    private static int indexBD = 0;

    public static void addPassport(Passport passport) {
        BD_PASSPORTS[indexBD++] = passport;
        System.out.println("Успешно: Паспорт добавлен в базу");
    }

    public static boolean checkingExclusivityPassport(String series, String numbers) {
        if (series == null && numbers == null) {
            System.out.println("Ошибка: серия или номер паспорта не заполнены");
            return false;
        }
        for (Passport passport : BD_PASSPORTS) {
            if (passport == null) {
                break;
            }
            if (passport.getNumbers() != null && passport.getSeries() != null) {
                if (passport.getNumbers().equals(numbers) && passport.getSeries().equals(series)) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void getPassports() {
        System.out.println("Вывод всех паспортов из базы:");
        for (Passport passport : BD_PASSPORTS) {
            if ( passport != null) {
                System.out.println(passport.getSeries() + " - " + passport.getNumbers());
            }
        }
    }
}
