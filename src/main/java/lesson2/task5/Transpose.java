package lesson2.task5;

public class Transpose {

    public static void main(String[] args) {
        Transpose transpose = new Transpose();
        transpose.printTransposeAndOriginalArray(transpose.fillInArray());
    }

    int[][] fillInArray() {
        final int M = (3 + (int) (Math.random() * 3));
        final int N = (3 + (int) (Math.random() * 3));
        int[][] filledArray = new int[M][N];
        for (int i = 0; i < filledArray.length; i++) {
            for (int j = 0; j < filledArray[i].length; j++) {
                filledArray[i][j] = (int) (Math.random() * 20);
            }
        }
        return filledArray;
    }

    void printTransposeAndOriginalArray(int[][] originalArray) {
        int[][] transposeArray = new int[originalArray[0].length][originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                transposeArray[j][i] = originalArray[i][j];
            }
        }

        printArray(originalArray);
        printArray(transposeArray);
    }

    void printArray(int[][] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            for (int j = 0; j < printArray[i].length; j++) {
                if (j == printArray[i].length - 1) {
                    System.out.print(printArray[i][j] + " ");
                } else {
                    System.out.print(printArray[i][j] + ", ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
