package docs.Documents;

import Interfaces.TypeOfCreatedDocsInterface;

public abstract class AbstractDocument implements TypeOfCreatedDocsInterface {

    public int id;
    String documentName;
    String documentText;
    int documentRegistrationNumber;
    String documentRegistrationDate;
    String authorsName;

    public AbstractDocument() {
    }

    public AbstractDocument(int id, String documentName, String documentText,
            int documentRegistrationNumber,
            String documentRegistrationDate,
            String authorsName) {
        this.id = id;
        this.documentName = documentName;
        this.documentText = documentText;
        this.documentRegistrationNumber = documentRegistrationNumber;
        this.documentRegistrationDate = documentRegistrationDate;
        this.authorsName = authorsName;
    }

    public String getDocumentName() {
        return this.documentName;
    }

}
