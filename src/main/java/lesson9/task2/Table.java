package lesson9.task2;

public class Table implements Movable {
        String type = "стол";

        @Override
        public void move() {
            System.out.printf("Предмет %s перемещен%n", type);
        }
}
