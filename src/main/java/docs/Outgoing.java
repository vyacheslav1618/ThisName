
package docs;

public class Outgoing extends AbstractDocument {
    public String sender;
    public String delivery_method;

    public Outgoing(int id, String document_name, String document_text
            , int document_registration_number, 
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
}