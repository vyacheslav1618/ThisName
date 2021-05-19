package docs;

public class Task extends AbstractDocument {
    public String date_of_issue_of_order;
    public String term_of_execution_of_order;
    public String responsible_executor;
    public String sign_of_control;
    public String orders_controller;

    public Task(int id, String document_name, String document_text
            , int document_registration_number, String document_registration_date
            , String authors_name, String date_of_issue_of_order
            , String term_of_execution_of_order, String responsible_executor
            , String sign_of_control, String orders_controller) {
        super(id, document_name, document_text, document_registration_number
                , document_registration_date, authors_name);
        this.date_of_issue_of_order = date_of_issue_of_order;
        this.term_of_execution_of_order = term_of_execution_of_order;
        this.responsible_executor = responsible_executor;
        this.sign_of_control = sign_of_control;
        this.orders_controller = orders_controller;
    }
    @Override
    public String toString() {
        return "Task{\nid: " + this.id + ",\ndocument_name: " + this.document_name 
                + ",\ndocument_text: " + this.document_text 
                + ",\ndocument_registration_number: " 
                + this.document_registration_number 
                + ",\ndocument_registration_date: " 
                + this.document_registration_date + ",\nauthors_name: " 
                + this.authors_name + ",\ndate_of_issue_of_order: " 
                + this.date_of_issue_of_order + ",\nterm_of_execution_of_order: " 
                + this.term_of_execution_of_order + ",\nresponsible_executor: " 
                + this.responsible_executor + ",\nsign_of_control: " 
                + this.sign_of_control + ",\norders_controller: " 
                + this.orders_controller + "}\n";
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}