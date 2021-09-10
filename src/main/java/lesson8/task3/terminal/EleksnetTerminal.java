package lesson8.task3.terminal;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal (String address) {
        super(address, Company.ELEKSNET, 0.11d, 300d);
    }
}