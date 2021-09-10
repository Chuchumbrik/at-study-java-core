package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;
import lesson9.task3.TwoParameterFigure;

public class Rectangle extends TwoParameterFigure implements FigureLength, FigureArea {
    @Override
    public double getLength() {
        return 2 * (side1 + side2);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    protected void printFigure() {
        System.out.printf("Rectangle %d, %d : Длина - %.1f, Площадь - %.1f%n", side1, side2, getLength(), getArea());
    }
}
