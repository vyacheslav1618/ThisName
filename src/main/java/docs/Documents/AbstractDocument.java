package docs.Documents;

public abstract class AbstractDocument {

    int id;
    String document_name;
    String document_text;
    int document_registration_number;
    String document_registration_date;
    String authors_name;

    public AbstractDocument() {
    }

    public AbstractDocument(int id, String document_name, String document_text,
             int document_registration_number,
             String document_registration_date,
             String authors_name) {
        this.id = id;
        this.document_name = document_name;
        this.document_text = document_text;
        this.document_registration_number = document_registration_number;
        this.document_registration_date = document_registration_date;
        this.authors_name = authors_name;
    }

    public void SaveDocument() {
        System.out.println("Document save!");
    }

    public String getDocument_name() {
        return this.document_name;
    }

    public void Compare_method() {
        System.out.println("Nothing to compare");
    }

}