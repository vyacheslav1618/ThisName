package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Outgoing extends AbstractDocument {

    public String sender;
    public String deliveryMethod;

    public Outgoing() {
    }

    public Outgoing(int id, String documentName, String documentText,
            int documentRegistrationNumber,
            String documentRegistrationDate, String authorsName,
            String sender, String deliveryMethod) {
        super(id, documentName, documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName);
        this.sender = sender;
        this.deliveryMethod = deliveryMethod;
    }

    @Override
    public String toString() {
        return "Outgoing{\nid: " + this.id + ",\ndocumentName: "
                + this.documentName + ",\ndocumentText: " + this.documentText
                + ",\ndocumentRegistrationNumber: "
                + this.documentRegistrationNumber
                + ",\ndocumentRegistrationDate: "
                + this.documentRegistrationDate + ",\nauthorsName='"
                + this.authorsName + ",\nsender: " + this.sender
                + ",\ndeliveryMethod: " + this.deliveryMethod + "}\n";
    }
}
