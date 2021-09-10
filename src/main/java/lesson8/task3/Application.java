package lesson8.task3;

import lesson8.task3.terminal.EleksnetTerminal;
import lesson8.task3.terminal.QiwiTerminal;
import lesson8.task3.terminal.Terminal;
import lesson8.task3.terminal.TinkoffTerminal;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Terminal> terminals = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15")
        );
        int[] pays = new int[] {50, 150, 300, 450, 600, 800, 1000, 1500};

        for (Terminal terminal : terminals) {
            for (int pay : pays) {
                terminal.pay("+7(910)000-0"+pay, pay);
            }
            System.out.println("---------");
        }
    }
}
