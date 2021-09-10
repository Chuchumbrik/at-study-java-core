package lesson8.task3.terminal;

public class Terminal implements TopUpBalance {
    protected String address;
    protected Company company;
    protected double  commission;
    protected double  noTaxLimit;

    public Terminal(String address, Company company, double commission, double noTaxLimit) {
        this.address = address;
        this.company = company;
        this.commission = commission;
        this.noTaxLimit = noTaxLimit;

    }

    @Override
    public void pay(String phone, double amount) {
        double payment = amount >= noTaxLimit
                ? amount
                : amount * (1d - commission / 100);
        System.out.printf("Внесена сумма %.2f для пополнения телефона %s. Баланс пополнен на сумму %.2f. С уважением, ваш %s, %s%n",
                amount, phone, payment, company.getName(), address);
    }
}
