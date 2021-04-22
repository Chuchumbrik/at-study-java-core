package lesson2.task4;

import java.util.Arrays;

public class IdenticalCharacters {

    public static void main(String[] args) {
        IdenticalCharacters identicalCharacters = new IdenticalCharacters();
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters1("Hello","World"));
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters1("ping","pong"));
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters1("pong","asdf"));
        System.out.println(identicalCharacters.makingStringOfIdenticalCharacters1("post","get"));
    }

//    String makingStringOfIdenticalCharacters(String stringFirst, String stringSecond){
//        String result = "", test;
//        for (int i = 0; i < stringFirst.length(); i++) {
//            for (int j = 0; j < stringSecond.length(); j++) {
//                if (stringFirst.charAt(i) == stringSecond.charAt(j)){
//                    test = stringFirst.charAt(i) + "";
//                    if (!result.contains(test))
//                        result += stringFirst.charAt(i);
//                }
//            }
//        }
//        char tempArray[] = result.toCharArray();
//        Arrays.sort(tempArray);
//        return new String(tempArray);
//    }


    //Супер изящно по сравнению с моим решенир
    String makingStringOfIdenticalCharacters1(String stringFirst, String stringSecond){
        String result = "";

        char tempArray[] = stringFirst.toCharArray();
        Arrays.sort(tempArray);

        for (char item: tempArray) {
            String itemChar = String.valueOf(item);
            if (result.contains(itemChar)) continue;
            if (stringSecond.contains(itemChar)) result += itemChar;
        }

        return result;
    }
}
