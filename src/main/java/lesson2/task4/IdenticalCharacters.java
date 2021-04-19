package lesson2.task4;

import java.util.Arrays;

public class IdenticalCharacters {

    public static void main(String[] args) {
        IdenticalCharacters identicalCharacters = new IdenticalCharacters();
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters("Hello","World"));
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters("ping","pong"));
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters("pong","asdf"));
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters("post","get"));
    }

    String makingStringOfIdenticalCharacters(String stringFirst, String stringSecond){
        String result = "", test;
        for (int i = 0; i < stringFirst.length(); i++) {
            for (int j = 0; j < stringSecond.length(); j++) {
                if (stringFirst.charAt(i) == stringSecond.charAt(j)){
                    test = stringFirst.charAt(i) + "";
                    if (!result.contains(test))
                        result += stringFirst.charAt(i);
                }
            }
        }
        char tempArray[] = result.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
