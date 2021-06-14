package lesson4.task3.workers;

class Accountant {
    private static final String ACCOUNTANT_TITLE = "Бухгалтером";

    static protected void takeTicket(int ticketNumber) {
        System.out.printf("Заявка %d была принята %s%n%n", ticketNumber, ACCOUNTANT_TITLE);
    }
}
