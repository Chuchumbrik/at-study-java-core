package lesson4.task3.workers;

class SysAdmin {
    private static final String SYSADMIN_TITLE = "СисАдмином";

    static protected void takeTicket(int ticketNumber) {
        System.out.printf("Заявка %d была принята %s%n%n", ticketNumber, SYSADMIN_TITLE);
    }
}
