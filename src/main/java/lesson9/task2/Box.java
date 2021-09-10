package lesson9.task2;

public class Box implements Movable {
    String type = "ящик";

    @Override
    public void move() {
        System.out.printf("Предмет %s перемещен%n", type);
    }
}
