package lesson6.task4;

public enum IdentityDocumentType {
    MILITARY_ID ("ББ 0999999", "Военный билет", "07"),
    DIPLOMATIC_PASSPORT ("99 9999999", "Дипломатический паспорт", "09"),
    FOREIGN_CITIZEN_PASSPORT ("SSSSSSSSSSSSSSSSSSSSSSSSS", "Паспорт иностранного гражданина", "10"),
    RUSSIAN_CITIZEN_PASSPORT ("99 99 999999", "Паспорт гражданина Российской Федерации", "21"),
    INTERNATIONAL_PASSPORT ("99 9999999", "Загранпаспорт гражданина Российской Федерации", "22");

    private String title;
    private String name;
    private String code;

    IdentityDocumentType(String title, String name, String code) {
        this.title = title;
        this.name = name;
        this.code = code;
    }

    public String getName() { return name; }

    public String getCode() { return code; }

    public String getTitle() {
        return title;
    }

    public static IdentityDocumentType byCode(String code) {
        for (IdentityDocumentType documentType : values()) {
            if (documentType.code.equals(code)) return documentType;
        }
        return null;
    }
}
