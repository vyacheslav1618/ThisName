package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class DocumentCommon extends AbstractDocument {

    public DocumentCommon() {
    }

    public DocumentCommon(int id, String documentName, String documentText,
            int documentRegistrationNumber,
            String documentRegistrationDate, String authorsName) {
        super(id, documentName, documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName);
    }

    @Override
    public String toString() {
        return "\nDocument{\nid: " + this.id + ",\ndocumentName: "
                + this.documentName + ",\ndocumentText: "
                + this.documentText + ",\ndocumentRegistrationNumber: "
                + this.documentRegistrationNumber
                + ",\ndocumentRegistrationDate: "
                + this.documentRegistrationDate + ",\nauthorsName: "
                + this.authorsName + "}\n";
    }
}
