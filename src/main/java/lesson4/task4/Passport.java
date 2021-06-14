package lesson4.task4;

public class Passport {
    private String series;
    private String numbers;

    private static final String SERIES_REGEX = "^(\\d{4})$";
    private static final String NUMBERS_REGEX = "^(\\d{6})$";

    public Passport() {
        Stash.addPassport(this);
    }

    public String getSeries() {
        return this.series;
    }

    public String getNumbers() {
        return this.numbers;
    }


    public Passport setSeries(String series) {
        if (Stash.checkingExclusivityPassport(series, this.numbers) && this.numbers != null) {
            System.out.println("Ошибка: Паспорт уже существет в базе");
            return this;
        }
        if (series.matches(SERIES_REGEX)) {
            this.series = series;
            System.out.printf("Успешно: серия паспорта установлена - %s%n", this.series);
        } else {
            System.out.println("Ошибка: серия паспорта должен состоять из 4 цифр");
        }
        return this;
    }

    public Passport setNumbers(String numbers) {
        if (Stash.checkingExclusivityPassport(this.series, numbers) && this.series != null) {
            System.out.println("Ошибка: Паспорт уже существет в базе");
            return this;
        }
        if (numbers.matches(NUMBERS_REGEX)) {
            this.numbers = numbers;
            System.out.printf("Успешно: номер паспорта установлена - %s%n", this.numbers);
        } else {
            System.out.println("Ошибка: Номер паспорта должен состоять из 6 цифр");
        }
        return this;
    }
}
