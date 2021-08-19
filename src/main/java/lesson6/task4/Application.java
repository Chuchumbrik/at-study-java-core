package lesson6.task4;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        final int countPersons = 500;
        HashSet<Person> persons = new HashSet<>(countPersons);
        for (int i = 0; i < countPersons; i++) {
            persons.add(Person.random());
        }

        HashMap<IdentityDocumentType, Integer> docTypeAndCounts = new HashMap<>();
        for(int i = 0; i < IdentityDocumentType.values().length; i++) {
            docTypeAndCounts.put(IdentityDocumentType.values()[i], 0);
        }
        for (Person person : persons) {
            IdentityDocumentType docType = person.getIdentityDocument().getTypeDocument();
            docTypeAndCounts.put(docType, docTypeAndCounts.get(docType) + 1);
        }

        List<String> sortedCodes = new ArrayList<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            sortedCodes.add(documentType.getCode());
        }
        Collections.sort(sortedCodes);
        Collections.reverse(sortedCodes);

        for (String code : sortedCodes) {
            IdentityDocumentType documentType = IdentityDocumentType.byCode(code);
            System.out.printf("%s (%s): %d%n", documentType.getName(), code, docTypeAndCounts.get(documentType));
        }

        Iterator iterator = persons.iterator();
        while(iterator.hasNext()) {
            Person person = (Person) iterator.next();
            if (!person.getIdentityDocument().getTypeDocument().getCode().equals("21"))
                iterator.remove();
        }

        System.out.println("Количество людей в списке: " + persons.size());

    }

}
