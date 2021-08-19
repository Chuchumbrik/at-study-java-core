package lesson7.task1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(6);
        list.add(0, 4);
        System.out.println(list);
        list.contains(6);
        list.contains(7);
        list.size();
        list.get(-7);

    }
}
