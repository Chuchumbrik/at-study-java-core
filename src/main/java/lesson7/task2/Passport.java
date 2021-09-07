package lesson7.task2;

import java.util.Random;

public class Passport {
    int series;
    int number;

    public Passport() {
        this.series = new Random().nextInt(9000) + 1000;
        this.number = new Random().nextInt(900000) + 100000;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
