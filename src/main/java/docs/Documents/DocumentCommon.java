package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "DocumentCommon")
@XmlType(propOrder = {"id", "document_name", "document_text",
     "document_registration_number", "document_registration_date",
     "authors_name"})

public class DocumentCommon extends AbstractDocument implements Comparable<DocumentCommon> {

    public DocumentCommon() {
    }

    public DocumentCommon(int id, String document_name, String document_text,
            int document_registration_number,
            String document_registration_date, String authors_name) {
        super(id, document_name, document_text, document_registration_number,
                document_registration_date, authors_name);
    }

    @Override
    public String toString() {
        return "\nDocument{\nid: " + this.id + ",\ndocument_name: "
                + this.document_name + ",\ndocument_text: "
                + this.document_text + ",\ndocument_registration_number: "
                + this.document_registration_number
                + ",\ndocument_registration_date: "
                + this.document_registration_date + ",\nauthors_name: "
                + this.authors_name + "}\n";
    }

    @Override
    public int compareTo(DocumentCommon documentCommon) {
        return documentCommon.id >= id ? -1 : 0;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getDocument_name() {
        return document_name;
    }

    public void setDocument_name(String document_name) {
        this.document_name = document_name;
    }
    
    @XmlElement
    public int getDocument_registration_number() {
        return document_registration_number;
    }
    public void setDocument_registration_number(int document_registration_number) {
        this.document_registration_number = document_registration_number;
    }

    @XmlElement
    public String getDocument_text() {
        return document_text;
    }
    public void setDocument_text(String document_text) {
        this.document_text = document_text;
    }

    @XmlElement
    public String getDocument_registration_date() {
        return document_registration_date;
    }
    public void setDocument_registration_date(String document_registration_date) {
        this.document_registration_date = document_registration_date;
    }

    @XmlElement
    public String getAuthors_name() {
        return authors_name;
    }
    public void setAuthors_name(String authors_name) {
        this.authors_name = authors_name;
    }

}
