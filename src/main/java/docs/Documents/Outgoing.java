package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Outgoing")
@XmlType(propOrder = {"id", "document_name", "document_registration_number",
    "sender", "delivery_method"})
public class Outgoing extends AbstractDocument {

    private String sender;
    private String delivery_method;

    public Outgoing() {
    }

    public Outgoing(int id, String document_name, String document_text,
            int document_registration_number,
            String document_registration_date, String authors_name,
            String sender, String delivery_method) {
        super(id, document_name, document_text, document_registration_number,
                document_registration_date, authors_name);
        this.sender = sender;
        this.delivery_method = delivery_method;
    }

    @Override
    public String toString() {
        return "Outgoing{\nid: " + this.id + ",\ndocument_name: "
                + this.document_name + ",\ndocument_text: " + this.document_text
                + ",\ndocument_registration_number: "
                + this.document_registration_number
                + ",\ndocument_registration_date: "
                + this.document_registration_date + ",\nauthors_name='"
                + this.authors_name + ",\nsender: " + this.sender
                + ",\ndelivery_method: " + this.delivery_method + "}\n";
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
    public String getDelivery_method() {
        return delivery_method;
    }

    public void setDelivery_method(String delivery_method) {
        this.delivery_method = delivery_method;
    }
}

