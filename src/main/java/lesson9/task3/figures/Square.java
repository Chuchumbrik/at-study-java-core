package lesson9.task3.figures;

import lesson9.task3.FigureArea;
import lesson9.task3.FigureLength;
import lesson9.task3.OneParameterFigure;

public class Square extends OneParameterFigure implements FigureLength, FigureArea {
    @Override
    public double getLength() {
        return side1 * 4;
    }

    @Override
    public double getArea() {
        return side1 * side1;
    }

    @Override
    public void printFigure() {
         System.out.printf("Square %d : Длина - %.1f, Площадь - %.1f%n", side1, getLength(), getArea());
        //System.out.println("Square " + side1 + " : Длина - " + getLength() + ", Площадь - " + getArea());
    }
}
