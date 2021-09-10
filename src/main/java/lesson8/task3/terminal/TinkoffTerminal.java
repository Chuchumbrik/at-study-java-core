package lesson8.task3.terminal;

public class TinkoffTerminal extends Terminal {
    private final int minTopUpAmount = 100;

    public TinkoffTerminal(String address) {
        super(address, Company.TINKOFF, 0.09d, 600);
    }

    @Override
    public void pay(String phoneNumber, double topUpAmount) {
        if (topUpAmount < minTopUpAmount) {
            System.out.printf("Минимальная сумма для пополнения баланса %d рублей. С уважением, ваш %s %s.\n", minTopUpAmount, company.getName(), address);
            return;
        }
        super.pay(phoneNumber, topUpAmount);
    }
}

