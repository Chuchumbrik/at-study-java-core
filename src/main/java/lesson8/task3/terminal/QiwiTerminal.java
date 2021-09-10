package lesson8.task3.terminal;

public class QiwiTerminal extends Terminal {

    public QiwiTerminal(String address) {
        super(address, Company.QIWI, 0.07d, 1000d);
    }
}
