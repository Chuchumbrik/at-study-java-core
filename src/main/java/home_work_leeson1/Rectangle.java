package home_work_leeson1;

public class Rectangle {

    double square(int width, int height) {
        return width*height;
    }

    double perimeter(int width, int height) {
        return (2*(width+height));
    }

    boolean checkSquareGreatPerimeter(int width, int height){
        return square(width, height) > perimeter(width, height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.checkSquareGreatPerimeter(2,7));
        System.out.println(rectangle.checkSquareGreatPerimeter(6,5));
        System.out.println(rectangle.checkSquareGreatPerimeter(6,3));
    }
}
