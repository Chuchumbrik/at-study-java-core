package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;
import lesson9.task3.TwoParameterFigure;

public class Ellipse extends TwoParameterFigure implements FigureLength, FigureArea {
    @Override
    public double getLength() {
        int max = Math.max(side1, side2);
        int min = Math.min(side1, side2);
        return 4d * (Math.PI * max * min + max - min) / (max + min);
    }

    @Override
    public double getArea() {
        return Math.PI * side1 * side2;
    }

    @Override
    protected void printFigure() {
        System.out.printf("Ellipse %d, %d : Длина - %.1f, Площадь - %.1f%n", side1, side2, getLength(), getArea());
    }
}
