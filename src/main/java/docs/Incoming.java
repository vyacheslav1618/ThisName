package docs;

public class Incoming extends AbstractDocument {

    public String sender;
    public String addressee;
    public int outgoing_number;
    public String outgoing_registration_date;

    public Incoming(int id, String document_name, String document_text
            , int document_registration_number
            , String document_registration_date, String authors_name
            , String sender, String addressee, int outgoing_number
            , String outgoing_registration_date) {
        super(id, document_name, document_text, document_registration_number
                , document_registration_date, authors_name);
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
}
