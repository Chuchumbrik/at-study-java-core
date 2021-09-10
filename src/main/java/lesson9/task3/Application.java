package lesson9.task3;

import lesson9.task3.figures.RightTriangle;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            figures.add(Generator.generate());
        }

        for (Figure figure : figures) {
            figure.printFigure();
        }
        System.out.println();

        for (Figure figure : figures) {
            if (figure instanceof RightTriangle) {
                ((RightTriangle) figure).printHypotenuse();
            }
        }
    }
}