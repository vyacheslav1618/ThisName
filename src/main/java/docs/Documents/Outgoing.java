package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Outgoing")
@XmlType(propOrder = {"id", "documentName", "documentRegistrationNumber",
    "sender", "deliveryMethod"})
public class Outgoing extends AbstractDocument implements Comparable<Outgoing>{

    private String sender;
    private String deliveryMethod;

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

    @Override
    public int compareTo(Outgoing outgoing) {
        return outgoing.id >= id ? -1 : 0;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String DocumentName) {
        this.documentName = DocumentName;
    }

    @XmlAttribute
    public int getDocumentRegistrationNumber() {
        return documentRegistrationNumber;
    }

    public void setDocumentRegistrationNumber(int documentRegistrationNumber) {
        this.documentRegistrationNumber = documentRegistrationNumber;
    }

    @XmlElement
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @XmlElement
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}

