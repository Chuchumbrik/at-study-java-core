package lesson2.task1;

public class ConnectingTextOutput {

    void printByFor(String[] stringArray) {
        String result = "";
        for (int i = 0; i < stringArray.length; i++){
            result += stringArray[i];
            result += (i == stringArray.length - 1) ? "." : " ";
        }
        System.out.println(result);
    }

    void printByForEach(String[] stringArray) {
        String result = "";
        for (String string: stringArray)
            result += string + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printByWhile(String[] stringArray) {
        String result = "";
        int i = 0;
        while (i < stringArray.length) {
            result += stringArray[i];
            result += (i == stringArray.length - 1) ? "." : " ";
            i++;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        ConnectingTextOutput ConnectingTextOutput = new ConnectingTextOutput();
        String[] stringArray = {"Пятница", "это", "лучший", "день", "недели"};
        ConnectingTextOutput.printByFor(stringArray);
        ConnectingTextOutput.printByForEach(stringArray);
        ConnectingTextOutput.printByWhile(stringArray);
    }
}
