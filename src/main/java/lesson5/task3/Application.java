package lesson5.task3;

public class Application {
    public static void main(String[] args) {
        int numberOfDivisionsByZero = 0;
        final int numberOfIterations = ((int) (500 + Math.random() * 500));


        for (int i = 0; i < numberOfIterations; i++) {
            try {
                int result = ((int) (Math.random() * 5)) / ((int) (Math.random() * 5));
            } catch (ArithmeticException e) {
                numberOfDivisionsByZero++;
            }
        }

        System.out.printf("Из %d операций деления %d было выполнено с ошибкой",numberOfIterations ,numberOfDivisionsByZero);

    }
}
