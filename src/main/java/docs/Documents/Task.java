package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Task")
@XmlType(propOrder = {"id", "document_name", "document_registration_number",
    "term_of_execution_of_order", "responsible_executor",
    "sign_of_control", "orders_controller"})
public class Task extends AbstractDocument implements Comparable<Task>{

    private String date_of_issue_of_order;
    private String term_of_execution_of_order;
    private String responsible_executor;
    private String sign_of_control;
    private String orders_controller;

    public Task() {
    }

    public Task(int id, String document_name, String document_text,
            int document_registration_number, String document_registration_date,
            String authors_name, String date_of_issue_of_order,
            String term_of_execution_of_order, String responsible_executor,
            String sign_of_control, String orders_controller) {
        super(id, document_name, document_text, document_registration_number,
                document_registration_date, authors_name);
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
    public int compareTo(Task task) {
        return task.id >= id ? -1 : 0;
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
    public String getTerm_of_execution_of_order() {
        return term_of_execution_of_order;
    }

    public void setTerm_of_execution_of_order(String term_of_execution_of_order) {
        this.term_of_execution_of_order = term_of_execution_of_order;
    }
    
    @XmlElement
    public String getResponsible_executor() {
        return responsible_executor;
    }

    public void setResponsible_executor(String responsible_executor) {
        this.responsible_executor = responsible_executor;
    }
    
    @XmlElement
    public String getSign_of_control() {
        return sign_of_control;
    }

    public void setSign_of_control(String sign_of_control) {
        this.sign_of_control = sign_of_control;
    }
    
    @XmlElement
    public String getOrders_controller() {
        return orders_controller;
    }

    public void setOrders_controller(String orders_controller) {
        this.orders_controller = orders_controller;
    }
}