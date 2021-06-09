package docs.Documents;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Task extends AbstractDocument {

    public String dateOfIissueofOrder;
    public String termOfExecutionOfOrder;
    public String responsibleExecutor;
    public String signOfControl;
    public String ordersController;

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
}
