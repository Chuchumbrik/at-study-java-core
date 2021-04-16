package home_work_leeson1;

//Задание № 1
public class Circle {
    final double PI = 3.14;

    double square(int radius) {
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.square(0));
        System.out.println(circle.square(2));
        System.out.println(circle.square(100));
    }
}
