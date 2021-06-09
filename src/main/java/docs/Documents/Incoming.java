package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Incoming extends AbstractDocument {

    public String sender;
    public String addressee;
    public int outgoingNumber;
    public String outgoingRegistrationDate;

    public Incoming() {
    }

    public Incoming(int id, String documentName, String documentText,
            int documentRegistrationNumber,
            String documentRegistrationDate, String authorsName,
            String sender, String addressee, int outgoingNumber,
            String outgoingRegistrationDate) {
        super(id, documentName, documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName);
        this.sender = sender;
        this.addressee = addressee;
        this.outgoingNumber = outgoingNumber;
        this.outgoingRegistrationDate = outgoingRegistrationDate;
    }

    @Override
    public String toString() {
        return "Incoming{\nid: " + this.id + ",\ndocumentName: "
                + this.documentName + ",\ndocumentText: "
                + this.documentText + ",\ndocumentRegistrationNumber: "
                + this.documentRegistrationNumber
                + ",\ndocumentRegistrationDate: "
                + this.documentRegistrationDate + ",\nauthorsName: "
                + this.authorsName + ",\nsender: " + this.sender
                + ",\naddressee: " + this.addressee + ",\noutgoingNumber: "
                + this.outgoingNumber + ",\noutgoingRegistrationDate: "
                + this.outgoingRegistrationDate + "}\n";
    }
}
