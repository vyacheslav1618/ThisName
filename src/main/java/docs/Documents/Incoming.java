package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Incoming")
@XmlType(propOrder = {"id", "document_name", "document_registration_number",
    "sender", "addressee", "outgoing_number", "outgoing_registration_date"})
public class Incoming extends AbstractDocument {

    private String sender;
    private String addressee;
    private int outgoing_number;
    private String outgoing_registration_date;

    public Incoming() {
    }

    public Incoming(int id, String document_name, String document_text,
            int document_registration_number,
            String document_registration_date, String authors_name,
            String sender, String addressee, int outgoing_number,
            String outgoing_registration_date) {
        super(id, document_name, document_text, document_registration_number,
                document_registration_date, authors_name);
        this.sender = sender;
        this.addressee = addressee;
        this.outgoing_number = outgoing_number;
        this.outgoing_registration_date = outgoing_registration_date;
    }

    @Override
    public String toString() {
        return "Incoming{\nid: " + this.id + ",\ndocument_name: "
                + this.document_name + ",\ndocument_text: "
                + this.document_text + ",\ndocument_registration_number: "
                + this.document_registration_number
                + ",\ndocument_registration_date: "
                + this.document_registration_date + ",\nauthors_name: "
                + this.authors_name + ",\nsender: " + this.sender
                + ",\naddressee: " + this.addressee + ",\noutgoing_number: "
                + this.outgoing_number + ",\noutgoing_registration_date: "
                + this.outgoing_registration_date + "}\n";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public String getDocument_name() {
        return document_name;
    }

    public void setDocument_name(String document_name) {
        this.document_name = document_name;
    }

    @XmlAttribute
    public int getDocument_registration_number() {
        return document_registration_number;
    }

    public void setDocument_registration_number(int document_registration_number) {
        this.document_registration_number = document_registration_number;
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
    public int getOutgoing_number() {
        return outgoing_number;
    }

    public void setOutgoing_number(int outgoing_number) {
        this.outgoing_number = outgoing_number;
    }

    @XmlElement
    public String getOutgoing_registration_date() {
        return outgoing_registration_date;
    }

    public void setOutgoing_registration_date(String outgoing_registration_date) {
        this.outgoing_registration_date = outgoing_registration_date;
    }
}