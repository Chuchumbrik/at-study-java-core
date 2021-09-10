package lesson9.task3;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {
    public OneParameterFigure() {
        side1 = new Random().nextInt(10) + 1;
    }
}
