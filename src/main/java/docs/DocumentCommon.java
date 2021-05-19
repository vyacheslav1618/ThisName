package docs;

public class DocumentCommon extends AbstractDocument {

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
    public int compareTo(Object o) {
        return 0;
    }
}
