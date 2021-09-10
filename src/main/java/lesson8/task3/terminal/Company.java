package lesson8.task3.terminal;

public enum Company {
    QIWI("ООО \"Киви\""),
    ELEKSNET("ООО \"Элекснет\""),
    TINKOFF("АО \"Тинькофф\"");

    private String name;

    Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
