package lesson4.task3.workers;

class Logistician {
    private static final String LOGISTICIAN_TITLE = "Логистом";

    static protected void takeTicket(int ticketNumber) {
        System.out.printf("Заявка %d была принята %s%n%n", ticketNumber, LOGISTICIAN_TITLE);
    }
}
