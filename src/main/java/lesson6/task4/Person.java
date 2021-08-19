package lesson6.task4;

public class Person {

    private String lastName;
    private String firstName;
    private IdentityDocument identityDocument;

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
    }

    public static Person random() {
        Person person = new Person();
        person.setFirstName(NameGenerate.generate());
        person.setLastName(NameGenerate.generate());
        person.setIdentityDocument(IdentityDocument.random());
        return person;
    }
}
