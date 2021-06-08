package docs.Documents;

import Interfaces.TypeOfCreatedDocsInterface;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Incoming")
@XmlType(propOrder = {"id", "documentName", "documentRegistrationNumber",
    "sender", "addressee", "outgoingNumber", "outgoingRegistrationDate"})
public class Incoming extends AbstractDocument {

    private String sender;
    private String addressee;
    private int outgoingNumber;
    private String outgoingRegistrationDate;

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

    @Override
    public int compareTo(TypeOfCreatedDocsInterface a) {
        return ((AbstractDocument) a).id >= id ? -1 : 0;
    }
//    @Override
//    public int compareTo(Incoming incoming) {
//        return incoming.id >= id ? -1 : 0;
//    }

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

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
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
    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    @XmlElement
    public int getOutgoingNumber() {
        return outgoingNumber;
    }

    public void setOutgoingNumber(int outgoingNumber) {
        this.outgoingNumber = outgoingNumber;
    }

    @XmlElement
    public String getOutgoingRegistrationDate() {
        return outgoingRegistrationDate;
    }

    public void setOutgoingRegistrationDate(String outgoingRegistrationDate) {
        this.outgoingRegistrationDate = outgoingRegistrationDate;
    }
}
