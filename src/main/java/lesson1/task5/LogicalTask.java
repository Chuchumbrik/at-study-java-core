package lesson1.task5;

public class LogicalTask {

    boolean logicalOrInverted(boolean oneBoolean, boolean twoBoolean) {
        return !(oneBoolean || twoBoolean);
    }

    boolean logicalInvertedAnd(boolean oneBoolean, boolean twoBoolean) {
        return !oneBoolean && !twoBoolean;
    }

    public static void main(String[] args) {
        LogicalTask logicalTask = new LogicalTask();
        System.out.println(logicalTask.logicalOrInverted(false, false) + " " + logicalTask.logicalInvertedAnd(false, false));
        System.out.println(logicalTask.logicalOrInverted(false, true) + " " + logicalTask.logicalInvertedAnd(false, true));
        System.out.println(logicalTask.logicalOrInverted(true, false) + " " + logicalTask.logicalInvertedAnd(true, false));
        System.out.println(logicalTask.logicalOrInverted(true, true) + " " + logicalTask.logicalInvertedAnd(true, true));
    }
}
