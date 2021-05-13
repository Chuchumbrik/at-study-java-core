package lesson2.task1;

public class ConnectingTextOutput {

    void printByFor(String[] stringArray) {
        String result = "";
        for (int i = 0; i < stringArray.length; i++) {
            result += stringArray[i] + " ";
        }
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printByForEach(String[] stringArray) {
        String result = "";
        for (String string : stringArray) {
            result += string + " ";
        }
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printByWhile(String[] stringArray) {
        String result = "";
        int i = 0;
        while (i < stringArray.length) {
            result += stringArray[i] + " ";
            i++;
        }
        result = result.trim() + ".";
        System.out.println(result);
    }


    public static void main(String[] args) {
        ConnectingTextOutput connectingTextOutput = new ConnectingTextOutput();
        String[] stringArray = {"Пятница", "это", "лучший", "день", "недели"};
        connectingTextOutput.printByFor(stringArray);
        connectingTextOutput.printByForEach(stringArray);
        connectingTextOutput.printByWhile(stringArray);
    }
}
