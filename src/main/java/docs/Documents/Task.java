package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Task")
@XmlType(propOrder = {"id", "documentName", "documentRegistrationNumber",
    "termOfExecutionOfOrder", "responsibleExecutor",
    "signOfControl", "ordersController"})
public class Task extends AbstractDocument implements Comparable<Task>{

    private String dateOfIissueofOrder;
    private String termOfExecutionOfOrder;
    private String responsibleExecutor;
    private String signOfControl;
    private String ordersController;

    public Task() {
    }

    public Task(int id, String documentName, String documentText,
            int documentRegistrationNumber, String documentRegistrationDate,
            String authorsName, String dateOfIssueOfOrder,
            String termOfExecutionOfOrder, String responsibleExecutor,
            String signOfControl, String ordersController) {
        super(id, documentName, documentText, documentRegistrationNumber,
                documentRegistrationDate, authorsName);
        this.dateOfIissueofOrder = dateOfIissueofOrder;
        this.termOfExecutionOfOrder = termOfExecutionOfOrder;
        this.responsibleExecutor = responsibleExecutor;
        this.signOfControl = signOfControl;
        this.ordersController = ordersController;
    }

    @Override
    public String toString() {
        return "Task{\nid: " + this.id + ",\ndocumentName: " + this.documentName
                + ",\ndocumentText: " + this.documentText
                + ",\ndocumentRegistrationNumber: "
                + this.documentRegistrationNumber
                + ",\ndocumentRegistrationDate: "
                + this.documentRegistrationDate + ",\nauthorsName: "
                + this.authorsName + ",\ndateOfIissueofOrder: "
                + this.dateOfIissueofOrder + ",\ntermOfExecutionOfOrder: "
                + this.termOfExecutionOfOrder + ",\nresponsibleExecutor: "
                + this.responsibleExecutor + ",\nsignOfControl: "
                + this.signOfControl + ",\nordersController: "
                + this.ordersController + "}\n";
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
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    @XmlAttribute
    public int getDocumentRegistrationNumber() {
        return documentRegistrationNumber;
    }

    public void setDocumentRegistrationNumber(int documentRegistrationNumber) {
        this.documentRegistrationNumber = documentRegistrationNumber;
    }
    
    @XmlElement
    public String getTermOfExecutionOfOrder() {
        return termOfExecutionOfOrder;
    }

    public void setTermOfExecutionOfOrder(String termOfExecutionOfOrder) {
        this.termOfExecutionOfOrder = termOfExecutionOfOrder;
    }
    
    @XmlElement
    public String getResponsibleExecutor() {
        return responsibleExecutor;
    }

    public void setResponsibleExecutor(String responsibleExecutor) {
        this.responsibleExecutor = responsibleExecutor;
    }
    
    @XmlElement
    public String getSignOfControl() {
        return signOfControl;
    }

    public void setSignOfControl(String signOfControl) {
        this.signOfControl = signOfControl;
    }
    
    @XmlElement
    public String getOrdersController() {
        return ordersController;
    }

    public void setOrdersController(String ordersController) {
        this.ordersController = ordersController;
    }
}