package home_work_leeson1;

public class LogicalTask {

    boolean logicalOrInverted(boolean oneBoolean, boolean twoBoolean){
        return !(oneBoolean || twoBoolean);
    }

    boolean logicalInvertedAnd(boolean oneBoolean, boolean twoBoolean){
        return !oneBoolean && !twoBoolean;
    }

    public static void main(String[] args) {
        LogicalTask logicalTask = new LogicalTask();
        System.out.println(logicalTask.logicalOrInverted(false, false));
        System.out.println(logicalTask.logicalInvertedAnd(false, false));

        System.out.println(logicalTask.logicalOrInverted(false, true));
        System.out.println(logicalTask.logicalInvertedAnd(false, true));

        System.out.println(logicalTask.logicalOrInverted(true, false));
        System.out.println(logicalTask.logicalInvertedAnd(true, false));

        System.out.println(logicalTask.logicalOrInverted(true, true));
        System.out.println(logicalTask.logicalInvertedAnd(true, true));
    }
}
