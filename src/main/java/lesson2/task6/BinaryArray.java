package lesson2.task6;

public class BinaryArray {
    public static void main(String[] args) {
        BinaryArray binaryArray = new BinaryArray();
        binaryArray.invertArrayAfterValue(binaryArray.fillInArray());
    }

    int[][] fillInArray() {
        int[][] filledArray = new int[(4 + (int) (Math.random() * 3))][(4 + (int) (Math.random() * 3))];
        for (int i = 0; i < filledArray.length; i++){
            for (int j = 0; j < filledArray[i].length; j++){
                filledArray[i][j] = (int) (Math.random() * 2);
            }
        }
        filledArray[(1 + (int) (Math.random() * (filledArray.length - 2)))][(1 + (int) (Math.random() * (filledArray[0].length - 2)))] = 2;

        return filledArray;
    }

    void printArray(int[][] printArray) {
        for (int i = 0; i < printArray.length; i++){
            for (int j = 0; j < printArray[i].length; j++){
                System.out.print(printArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void invertArrayAfterValue(int[][] invertArray) {
        printArray(invertArray);
        boolean flag = false;
        for (int i = 0; i < invertArray.length; i++){
            for (int j = 0; j < invertArray[i].length; j++){
                if (invertArray[i][j] == 2) {
                    flag = true;
                    continue;
                }
                if (!flag) { continue; }
                if (invertArray[i][j] == 1) {
                    invertArray[i][j] = 0;
                } else {
                    invertArray[i][j] = 1;
                }
            }
        }
        printArray(invertArray);
    }


}
