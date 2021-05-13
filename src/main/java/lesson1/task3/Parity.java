package lesson1.task3;

public class Parity {

    boolean checkParityNumber(int number) {
        return number % 2 == 1;
    }

    public static void main(String[] args) {
        Parity parity = new Parity();
        System.out.println(parity.checkParityNumber(14));
        System.out.println(parity.checkParityNumber(19));
    }
}
