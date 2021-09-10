package lesson9.task2;

public class Square implements Drawable {
    String type = "квадрат";

    @Override
    public void draw() {
        System.out.printf("Тип %s нарисован%n", type);
    }
}
