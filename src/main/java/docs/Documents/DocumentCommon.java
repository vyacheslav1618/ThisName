package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "DocumentCommon")
@XmlType(propOrder = {"id", "documentName", "documentText",
     "documentRegistrationNumber", "documentRegistrationDate",
     "authorsName"})

public class DocumentCommon extends AbstractDocument implements Comparable<DocumentCommon> {

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
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
    
    @XmlElement
    public int getDocumentRegistrationNumber() {
        return documentRegistrationNumber;
    }
    public void setDocumentRegistrationNumber(int documentRegistrationNumber) {
        this.documentRegistrationNumber = documentRegistrationNumber;
    }

    @XmlElement
    public String getDocumentText() {
        return documentText;
    }
    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    @XmlElement
    public String getDocumentRegistrationDate() {
        return documentRegistrationDate;
    }
    public void setDocumentRegistrationDate(String documentRegistrationDate) {
        this.documentRegistrationDate = documentRegistrationDate;
    }

    @XmlElement
    public String getAuthorsName() {
        return authorsName;
    }
    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

}
