package lesson4.task3.workers;

public class ServiceDesk {
    private static int ticketNumber = 0;

    private static final String[] ACCOUNTANTS_KEYWORDS = {"справка", "отчет", "бюджет"};
    private static final String[] LOGISTICIANS_KEYWORDS = {"доставка", "курьер"};
    private static final String[] SYS_ADMINS_KEYWORDS = {"компьютер", "принтер", "сервер"};
    private static final String[] CLEANERS_KEYWORDS = {"уборк"};

    public static void createTicket(String description) {
        ticketNumber++;
        boolean occurrenceFlag = false;
        System.out.printf("Заявка %d была создана <%s>%n", ticketNumber, description);

        for (String checkingSubstring : ACCOUNTANTS_KEYWORDS) {
            if (description.contains(checkingSubstring)) {
                Accountant.takeTicket(ticketNumber);
                occurrenceFlag = true;
            }
        }

        if (!occurrenceFlag) {
            for (String checkingSubstring : LOGISTICIANS_KEYWORDS) {
                if (description.contains(checkingSubstring)) {
                    Logistician.takeTicket(ticketNumber);
                    occurrenceFlag = true;
                }
            }
        }

        if (!occurrenceFlag) {
            for (String checkingSubstring : SYS_ADMINS_KEYWORDS) {
                if (description.contains(checkingSubstring)) {
                    SysAdmin.takeTicket(ticketNumber);
                    occurrenceFlag = true;
                }
            }
        }

        if (!occurrenceFlag) {
            for (String checkingSubstring : CLEANERS_KEYWORDS) {
                if (description.contains(checkingSubstring)) {
                    Cleaner.takeTicket(ticketNumber);
                    occurrenceFlag = true;
                }
            }
        }

        if (!occurrenceFlag) {
            System.out.printf("Специалист по выполнению заявки %d не найден%n%n", ticketNumber);
        }
    }
}
