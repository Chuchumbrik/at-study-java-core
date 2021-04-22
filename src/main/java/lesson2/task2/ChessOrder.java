package lesson2.task2;

public class ChessOrder {

    void printByFor(int[][] binaryArray) {
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray.length; j++)
                System.out.print(binaryArray[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    void printByWhile(int[][] binaryArray) {
        int i = 0;
        int j = 0;
        while (i < binaryArray.length) {
            while (j < binaryArray.length) {
                System.out.print(binaryArray[i][j++]);
            }
            i++;
            j = 0;
            System.out.println();
        }
        System.out.println();
    }

    void printByForeach(int[][] binaryArray) {
        for (int[] rowArray: binaryArray) {
            for (int item: rowArray)
                System.out.print(item);
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ChessOrder chessOrder = new ChessOrder();
        int[][] binaryArray = new int[8][8];
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray.length; j++)
                binaryArray[i][j] = (i + j) % 2;
        }

        chessOrder.printByFor(binaryArray);
        chessOrder.printByWhile(binaryArray);
        chessOrder.printByForeach(binaryArray);
    }
}
