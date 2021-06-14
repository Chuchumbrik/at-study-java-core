package lesson5.task1;

public class Application {

    public static void main(String[] args) {
        final int M = (5 + (int) (Math.random() * 6));
        final int N = (5 + (int) (Math.random() * 6));
        int[] dividends = new int[M];
        int[] dividers = new int[N];
        int[][] result = new int[N][M];

        for (int i = 0; i < dividends.length; i++) {
            dividends[i] = (4 + (int) (Math.random() * 6));
            System.out.print(dividends[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < dividers.length; i++) {
            dividers[i] = ((int) (Math.random() * 4));
            System.out.print(dividers[i] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                try {
                    result[i][j] = dividends[j] / dividers[i];
                } catch (ArithmeticException e) {
                    result[i][j] = -1;
                }
            }
        }

        for (int[] row : result) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
