package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;
import lesson9.task3.TwoParameterFigure;

public class RightTriangle extends TwoParameterFigure implements FigureLength, FigureArea {

    public double getHypotenuse() {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

    @Override
    public double getLength() {
        return side1 + side2 + getHypotenuse();
    }

    @Override
    public double getArea() {
        return 0.5 * side1 * side2;
    }

    @Override
    protected void printFigure() {
        System.out.printf("RightTriangle %d, %d : Длина - %.1f, Площадь - %.1f%n", side1, side2, getLength(), getArea());
    }

    public void printHypotenuse() {
        System.out.printf("Гипотенуза треугольника %d, %d равна %.1f%n", side1, side2, getHypotenuse());
    }
}
