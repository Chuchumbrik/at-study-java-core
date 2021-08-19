package lesson6.task4;

import java.util.Random;

public class IdentityDocument {
    private IdentityDocumentType typeDocument;
    private String numberAndSeries;

    public IdentityDocumentType getTypeDocument() {
        return typeDocument;
    }

    public String getNumberAndSeries() {
        return numberAndSeries;
    }

    public void setTypeDocument(IdentityDocumentType typeDocument) {
        this.typeDocument = typeDocument;
    }

    public void setNumberAndSeries(String numberAndSeries) {
        this.numberAndSeries = numberAndSeries;
    }

    public static IdentityDocument random() {
        IdentityDocument identityDocument = new IdentityDocument();

        int pick = new Random().nextInt(IdentityDocumentType.values().length);
        identityDocument.setTypeDocument(IdentityDocumentType.values()[pick]);
        identityDocument.setNumberAndSeries(StringGenerator.generate(identityDocument.getTypeDocument().getTitle()));

        return identityDocument;
    }
}