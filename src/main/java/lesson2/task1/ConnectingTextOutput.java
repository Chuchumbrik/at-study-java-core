package lesson2.task1;

public class ConnectingTextOutput {

    void printFor(String[] stringArray) {
        String result = "";
        for (int i = 0; i < stringArray.length; i++){
            result += stringArray[i];
            result += (i == stringArray.length - 1) ? "." : " ";
        }
        System.out.println(result);
    }

    void printForeach(String[] stringArray) {
        String result = "";
        for (String string: stringArray)
            result += string + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    void printWhile(String[] stringArray) {
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
        ConnectingTextOutput.printFor(stringArray);
        ConnectingTextOutput.printForeach(stringArray);
        ConnectingTextOutput.printWhile(stringArray);
    }
}
