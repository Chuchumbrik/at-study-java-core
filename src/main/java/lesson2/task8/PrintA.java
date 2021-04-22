package lesson2.task8;

public class PrintA {
    public static void main(String[] args) {
        PrintA printA = new PrintA();
        int[] numbers = {-1, 2, 4, 7, 0};
        printA.outputQuantityHandlerOptionOne(numbers);
        printA.outputQuantityHandlerOptionTwo(numbers);
    }

    void outputQuantityHandlerOptionOne(int... numbers) {
        for (int number: numbers) {
            String result = "";

            switch (number) {
                case 1:
                case 2:
                case 3:
                case 4:
                    for (int i = 0; i < number; i++){
                        result += "A";
                    }
                    break;
                default:
                    result = "AAAAA";
            }
            System.out.println(result);
        }
        System.out.println();
    }

    void outputQuantityHandlerOptionTwo(int... numbers) {

//        for (int number: numbers) {
//            boolean outputFlag = false;
//            String result = "";
//
//            switch (number) {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    for (int i = 0; i < number; i++){
//                        result += "A";
//                    }
//                    outputFlag = true;
//                default:
//                    if (!outputFlag) {
//                        result = "AAAAA";
//                    }
//            }
//            System.out.println(result);
//        }
//        System.out.println();

        for (int number: numbers) {
            switch (number) {
                default:
                    System.out.print("A");
                case 4:
                    System.out.print("A");
                case 3:
                    System.out.print("A");
                case 2:
                    System.out.print("A");
                case 1:
                    System.out.print("A");
            }
        }
        System.out.println();
    }


}
