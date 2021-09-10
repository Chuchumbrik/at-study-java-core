package lesson9.task1;

import lesson9.task1.stamp.Mercedes;
import lesson9.task1.stamp.Mitsubishi;
import lesson9.task1.stamp.Nissan;
import lesson9.task1.stamp.Renault;

import java.util.Random;

public class Factory {

    public static Car make() {
        int change = new Random().nextInt(10) + 1;
        switch (change) {
            case 1: case 2: case 3: case 4:
                return new Renault();
            case 5: case 6: case 7:
                return new Nissan();
            case 8: case 9:
                return new Mitsubishi();
            case 10:
                return new Mercedes();
            default:
                return null;
        }
    }
}
