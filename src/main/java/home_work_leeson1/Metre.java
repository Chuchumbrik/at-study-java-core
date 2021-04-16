package home_work_leeson1;

public class Metre {
    int quantityMetre(int length){
        return length/100;
    }

    public static void main(String[] args) {
        Metre metre = new Metre();
        System.out.println(metre.quantityMetre(115));
        System.out.println(metre.quantityMetre(800));
        System.out.println(metre.quantityMetre(278));
    }
}
