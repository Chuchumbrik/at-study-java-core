package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;
import lesson9.task3.OneParameterFigure;

public class EquilateralTriangle extends OneParameterFigure implements FigureLength, FigureArea {
    @Override
    public double getLength() {
        return side1 * 3;
    }

    @Override
    public double getArea() {
        return side1 * side1 * 0.25 * Math.sqrt(3);
    }

    @Override
    protected void printFigure() {
        System.out.printf("EquilateralTriangle %d : Длина - %.1f, Площадь - %.1f%n", side1, getLength(), getArea());
    }
}
