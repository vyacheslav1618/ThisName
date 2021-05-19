package work_classes;

import docs.Documents.*;
import java.util.Date;

public class DocumentFactory {

    //создание переменных, которые будут использованы в XML
    private int id;
    private int document_registration_number;
    private String document_registration_date;
    private String authors_name;

    public DocumentCommon CreateDocumentCommon() {
        Date date = new Date();
        //создание работника из списка
        EmployeeBuilder eb = new EmployeeBuilder();
        //создание типа документа из списка
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
        //присвоение рандомного значения для id и document_registration_number
        id = 1 + (int) (Math.random() * 9000);
        document_registration_number = 1 + (int) (Math.random() * 11000);
        String document_name = tdb.CreateDocumentType();
        String document_text = "Enter text here...";
        document_registration_date = date.toString();
        authors_name = eb.CreateEmployee();
        DocumentCommon NewGeneratedDocument = new DocumentCommon(id, document_name,
                document_text, document_registration_number,
                document_registration_date, authors_name);
        return NewGeneratedDocument;
    }

    public Task CreateDocumentTask() {
        Date date = new Date();
        //создание работника из списка
        EmployeeBuilder eb = new EmployeeBuilder();
        //создание типа документа из списка
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
        //присвоение рандомного значения для id и document_registration_number
        id = 1 + (int) (Math.random() * 9000);
        document_registration_number = 1 + (int) (Math.random() * 11000);
        String document_name = tdb.CreateDocumentType();;
        String document_text = "Enter text here...";
        document_registration_date = date.toString();
        authors_name = eb.CreateEmployee();
        String date_of_issue_of_order = date.toString();
        String term_of_execution_of_order = date.toString();
        String responsible_executor = eb.CreateEmployee();
        String sign_of_control = "Controlled";
        String orders_controller = "OK";
        Task NewGeneratedDocument = new Task(id, document_name,
                document_text, document_registration_number,
                document_registration_date, authors_name,
                date_of_issue_of_order, term_of_execution_of_order,
                responsible_executor, sign_of_control, orders_controller);
        return NewGeneratedDocument;
    }

    public Incoming CreateDocumentIncoming() {
        Date date = new Date();
        //создание работника из списка
        EmployeeBuilder eb = new EmployeeBuilder();
        //создание типа документа из списка
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
        //присвоение рандомного значения для id и document_registration_number
        // и outgoing_number
        id = 1 + (int) (Math.random() * 9000);
        document_registration_number = 1 + (int) (Math.random() * 11000);
        int outgoing_number = 1 + (int) (Math.random() * 50000);
        String document_name = tdb.CreateDocumentType();
        String document_text = "Enter text here...";
        authors_name = eb.CreateEmployee();
        String sender = eb.CreateEmployee();
        String addressee = eb.CreateEmployee();
        document_registration_date = date.toString();
        String outgoing_registration_date = date.toString();
        Incoming NewGeneratedDocument2 = new Incoming(id, document_name,
                document_text, document_registration_number,
                document_registration_date, authors_name, sender,
                addressee, outgoing_number, outgoing_registration_date);
        return NewGeneratedDocument2;
    }

    public Outgoing CreateDocumentOutgoing() {
        Date date = new Date();
        //создание работника из списка
        EmployeeBuilder eb = new EmployeeBuilder();
        //создание типа документа из списка
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
        //присвоение рандомного значения для id и document_registration_number
        id = 1 + (int) (Math.random() * 9000);
        document_registration_number = 1 + (int) (Math.random() * 11000);
        String document_name = tdb.CreateDocumentType();
        String document_text = "Enter text here...";
        document_registration_date = date.toString();
        authors_name = eb.CreateEmployee();
        String sender = eb.CreateEmployee();
        String delivery_method = "Email";
        Outgoing NewGeneratedDocument3 = new Outgoing(id, document_name,
                document_text, document_registration_number,
                document_registration_date, authors_name, sender,
                delivery_method);
        return NewGeneratedDocument3;
    }

}
