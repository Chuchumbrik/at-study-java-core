package home_work_leeson1;

public class LogicalScheme {

    boolean logicalResult(boolean a, boolean b, boolean c, boolean d){
        return (a && b) && !(c || d);
    }

    public static void main(String[] args) {
        LogicalScheme logicalScheme = new LogicalScheme();
        System.out.println(logicalScheme.logicalResult(false, false, false, false));
        System.out.println(logicalScheme.logicalResult(true, true, true, true));
        System.out.println(logicalScheme.logicalResult(false, true, false, true));
        System.out.println(logicalScheme.logicalResult(true, false, true, false));
        System.out.println(logicalScheme.logicalResult(true, true, false, false));
    }
}
