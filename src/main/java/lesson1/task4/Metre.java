package lesson1.task4;

public class Metre {

    int getQuantityMetre(int length) {
        return length / 100;
    }

    public static void main(String[] args) {
        Metre metre = new Metre();
        System.out.println(metre.getQuantityMetre(115));
        System.out.println(metre.getQuantityMetre(800));
        System.out.println(metre.getQuantityMetre(278));
    }
}
