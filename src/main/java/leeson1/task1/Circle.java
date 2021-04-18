package leeson1.task1;

//Задание № 1
public class Circle {
    final double PI = 3.14;

    double getSquare(int radius) {
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getSquare(0));
        System.out.println(circle.getSquare(2));
        System.out.println(circle.getSquare(100));
    }
}
