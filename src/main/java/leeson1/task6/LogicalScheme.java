package leeson1.task6;

public class LogicalScheme {

    boolean getSchemeResult(boolean a, boolean b, boolean c, boolean d){
        return (a && b) && !(c || d);
    }

    public static void main(String[] args) {
        LogicalScheme logicalScheme = new LogicalScheme();
        System.out.println(logicalScheme.getSchemeResult(false, false, false, false));
        System.out.println(logicalScheme.getSchemeResult(true, true, true, true));
        System.out.println(logicalScheme.getSchemeResult(false, true, false, true));
        System.out.println(logicalScheme.getSchemeResult(true, false, true, false));
        System.out.println(logicalScheme.getSchemeResult(true, true, false, false));
    }
}
