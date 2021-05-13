package lesson2.task6;

import java.util.Random;

public class BinaryArray {
    public static void main(String[] args) {
        BinaryArray binaryArray = new BinaryArray();
        binaryArray.invertArrayAfterValue(binaryArray.fillInArray());
    }

    int[][] fillInArray() {
        int[][] filledArray = new int[new Random().nextInt(7)][new Random().nextInt(7)];
        for (int i = 0; i < filledArray.length; i++) {
            for (int j = 0; j < filledArray[i].length; j++) {
                filledArray[i][j] = new Random().nextInt(2);
            }
        }
        filledArray[(1 + new Random().nextInt(filledArray.length - 2))][(1 + new Random().nextInt(filledArray[0].length - 2))] = 2;

        return filledArray;
    }

    void printArray(int[][] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            for (int j = 0; j < printArray[i].length; j++) {
                System.out.print(printArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void invertArrayAfterValue(int[][] invertArray) {
        printArray(invertArray);
        boolean flag = false;
        for (int i = 0; i < invertArray.length; i++) {
            for (int j = 0; j < invertArray[i].length; j++) {
                if (invertArray[i][j] == 2) {
                    flag = true;
                } else if (flag) {
                    switch (invertArray[i][j]) {
                        case 0:
                            invertArray[i][j] = 1;
                            break;
                        case 1:
                            invertArray[i][j] = 0;
                    }
                }
            }
        }
        printArray(invertArray);
    }


}
