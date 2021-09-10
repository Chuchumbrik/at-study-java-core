package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;
import lesson9.task3.OneParameterFigure;

public class Circle extends OneParameterFigure implements FigureLength, FigureArea {
    @Override
    public double getLength() {
        return 2 * Math.PI * side1;
    }

    @Override
    public double getArea() {
        return Math.PI * side1 * side1;
    }

    @Override
    protected void printFigure() {
        System.out.printf("Circle %d : Длина - %.1f, Площадь - %.1f%n", side1, getLength(), getArea());
    }
}
