package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement
public abstract class AbstractDocument implements Comparable<AbstractDocument> {

    @XmlElement
    public int id;
    @XmlElement
    public String documentName;
    @XmlElement
    public String documentText;
    @XmlElement
    public int documentRegistrationNumber;
    @XmlElement
    public String documentRegistrationDate;
    @XmlElement
    public String authorsName;

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

    @Override
    public int compareTo(AbstractDocument a) {
        return a.id >= id ? -1 : 0;
    }

}
