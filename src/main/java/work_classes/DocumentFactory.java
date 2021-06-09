package work_classes;

import docs.Documents.*;
import java.util.Date;
import javax.xml.bind.annotation.*;

@XmlRegistry
public class DocumentFactory {

    public int id;
    public int documentRegistrationNumber;
    public String documentRegistrationDate;
    public String authorsName;

    public DocumentCommon CreateDocumentCommon() {
        Date date = new Date();
//create an employee from list
        EmployeeBuilder eb = new EmployeeBuilder();
//create type of document from list
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
//create random id and document registratoin number
        id = 1 + (int) (Math.random() * 9000);
        documentRegistrationNumber = 1 + (int) (Math.random() * 11000);
        String documentName = tdb.CreateDocumentType();
        String documentText = "Enter text here...";
        documentRegistrationDate = date.toString();
        authorsName = eb.CreateEmployee();
//create an object DocumentCommon type
        DocumentCommon NewGeneratedDocument = new DocumentCommon(id, documentName,
                documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName);
        return NewGeneratedDocument;
    }

    public Task CreateDocumentTask() {
        Date date = new Date();
        EmployeeBuilder eb = new EmployeeBuilder();
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
        id = 1 + (int) (Math.random() * 9000);
        documentRegistrationNumber = 1 + (int) (Math.random() * 11000);
        String documentName = tdb.CreateDocumentType();
        String documentText = "Enter text here...";
        documentRegistrationDate = date.toString();
        authorsName = eb.CreateEmployee();
        String dateOfIissueOfOrder = date.toString();
        String termOfExecutionOfOrder = date.toString();
        String responsibleExecutor = eb.CreateEmployee();
        String signOfControl = "Controlled";
        String ordersController = "OK";
        Task NewGeneratedDocument = new Task(id, documentName,
                documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName,
                dateOfIissueOfOrder, termOfExecutionOfOrder,
                responsibleExecutor, signOfControl, ordersController);
        return NewGeneratedDocument;
    }

    public Incoming CreateDocumentIncoming() {
        Date date = new Date();
        EmployeeBuilder eb = new EmployeeBuilder();
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
        id = 1 + (int) (Math.random() * 9000);
        documentRegistrationNumber = 1 + (int) (Math.random() * 11000);
        int outgoingNumber = 1 + (int) (Math.random() * 50000);
        String documentName = tdb.CreateDocumentType();
        String documentText = "Enter text here...";
        authorsName = eb.CreateEmployee();
        String sender = eb.CreateEmployee();
        String addressee = eb.CreateEmployee();
        documentRegistrationDate = date.toString();
        String outgoingRegistrationDate=  date.toString();
        Incoming NewGeneratedDocument2 = new Incoming(id, documentName,
                documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName, sender,
                addressee, outgoingNumber, outgoingRegistrationDate);
        return NewGeneratedDocument2;
    }

    public Outgoing CreateDocumentOutgoing() {
        Date date = new Date();
        EmployeeBuilder eb = new EmployeeBuilder();
        TypeOfDocumentBuilder tdb = new TypeOfDocumentBuilder();
        id = 1 + (int) (Math.random() * 9000);
        documentRegistrationNumber = 1 + (int) (Math.random() * 11000);
        String documentName = tdb.CreateDocumentType();
        String documentText = "Enter text here...";
        documentRegistrationDate = date.toString();
        authorsName = eb.CreateEmployee();
        String sender = eb.CreateEmployee();
        String deliveryMethod = "Email";
        Outgoing NewGeneratedDocument3 = new Outgoing(id, documentName,
                documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName, sender,
                deliveryMethod);
        return NewGeneratedDocument3;
    }

}
