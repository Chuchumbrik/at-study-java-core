package lesson9.task3;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {
    protected int side2;

    public int getSide2() {
        return side2;
    }

    public TwoParameterFigure() {
        side1 = new Random().nextInt(10) + 1;
        side2 = new Random().nextInt(10) + 1;
    }


}
