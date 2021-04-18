package lesson2.task2;

public class ChessOrder {

    void printByFor(int[][] binaryArray) {
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray.length; j++) {
                System.out.print(binaryArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void printByWhile(int[][] binaryArray) {
        int i = 0;
        int j;
        while (i < binaryArray.length) {
            j = 0;
            while (j < binaryArray.length) {
                System.out.print(binaryArray[i][j]);
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println();
    }

    void printByForeach(int[][] binaryArray) {
        for (int[] itemsArray: binaryArray) {
            for (int item: itemsArray) {
                System.out.print(item);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ChessOrder chessOrder = new ChessOrder();
        int[][] binaryArray = new int[8][8];
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray.length; j++) {
                if (i % 2 == 1) {
                    binaryArray[i][j] = (j % 2 == 1) ? 0 : 1;
                } else {
                    binaryArray[i][j] = (j % 2 == 0) ? 0 : 1;
                }
            }
        }

        chessOrder.printByFor(binaryArray);
        chessOrder.printByWhile(binaryArray);
        chessOrder.printByForeach(binaryArray);
    }
}
