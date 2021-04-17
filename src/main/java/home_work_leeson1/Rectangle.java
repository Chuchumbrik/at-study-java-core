package home_work_leeson1;

public class Rectangle {

    double getSquare(int width, int height) {
        return width*height;
    }

    double getPerimeter(int width, int height) {
        return (2*(width+height));
    }

    boolean checkSquareGreatPerimeter(int width, int height){
        return getSquare(width, height) > getPerimeter(width, height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.checkSquareGreatPerimeter(2,7));
        System.out.println(rectangle.checkSquareGreatPerimeter(6,5));
        System.out.println(rectangle.checkSquareGreatPerimeter(6,3));
    }
}
