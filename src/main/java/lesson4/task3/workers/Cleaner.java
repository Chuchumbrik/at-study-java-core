package lesson4.task3.workers;

class Cleaner {
    private static final String CLEANER_TITLE = "Уборщиком";

    static protected void takeTicket(int ticketNumber) {
        System.out.printf("Заявка %d была принята %s%n%n", ticketNumber, CLEANER_TITLE);
    }
}
