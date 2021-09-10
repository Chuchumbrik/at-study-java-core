package lesson9.task2;

public class Circle implements Drawable {
    String type = "круг";

    @Override
    public void draw() {
        System.out.printf("Тип %s нарисован%n", type);
    }
}
